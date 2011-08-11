/**
 * Copyright (c) ObjectFabric Inc. All rights reserved.
 *
 * This file is part of ObjectFabric (objectfabric.com).
 *
 * ObjectFabric is licensed under the Apache License, Version 2.0, the terms
 * of which may be found at http://www.apache.org/licenses/LICENSE-2.0.html.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package com.objectfabric.tests;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.objectfabric.Concurrent;
import com.objectfabric.FieldListener;
import com.objectfabric.generated.SimpleClass;
import com.objectfabric.generated.SimpleObjectModel;
import com.objectfabric.misc.Debug;
import com.objectfabric.misc.SeparateClassLoader;
import com.objectfabric.transports.socket.SocketServer;

public class Distributed extends Concurrent {

    private SocketServer _server;

    public Distributed() {
    }

    @Test
    @Override
    public void runSimple1() {
        super.runSimple1();
    }

    @Test
    @Override
    public void runSimple2() {
        super.runSimple2();
    }

    @Test
    @Override
    public void runSimple3() {
        super.runSimple3();
    }

    @Test
    @Override
    public void runUseLast1() {
        super.runUseLast1();
    }

    @Test
    @Override
    public void runUseLast2() {
        super.runUseLast2();
    }

    @Test
    @Override
    public void runProcessAll1() {
        super.runProcessAll1();
    }

    @Test
    @Override
    public void runProcessAll2() {
        super.runProcessAll2();
    }

    @Test
    @Override
    public void runProcessAll3() {
        super.runProcessAll3();
    }

    @Test
    @Override
    public void runTwoIntegers1() {
        super.runTwoIntegers1();
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList<Thread> startCommits(int threadCount, final int writeCount, final int flags) {
        ArrayList<SeparateClassLoader> clients = new ArrayList<SeparateClassLoader>();

        for (int i = 0; i < threadCount; i++) {
            SeparateClassLoader client = new SeparateClassLoader("Client " + i, DistributedClient.class.getName(), true);
            client.setArgTypes(int.class, int.class, int.class);
            client.setArgs(i, writeCount, flags);
            clients.add(client);
            client.start();
        }

        for (SeparateClassLoader client : clients)
            client.waitForProgress(DistributedClient.CONNECTED);

        return (ArrayList) clients;
    }

    @Override
    protected void setSimpleClass(SimpleClass value) {
        super.setSimpleClass(value);

        SimpleObjectModel.register();

        _server = new SocketServer(4444, value);

        try {
            _server.start();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void after() {
        _server.stop();

        super.after();
    }

    @SuppressWarnings("unchecked")
    @Override
    public int finish(TestNotifier notifier, ArrayList<Thread> threads, int count, FieldListener listener, SimpleClass entity, int flags) {
        ArrayList<SeparateClassLoader> clients = (ArrayList) threads;
        long start = System.nanoTime();

        for (SeparateClassLoader client : clients)
            client.waitForProgress(DistributedClient.DONE);

        Debug.assertion(_server.getSessions().size() == threads.size());

        for (SeparateClassLoader client : clients)
            client.getProgress().set(DistributedClient.EXIT);

        while (_server.getSessions().size() > 0) {
            try {
                Thread.sleep(1);
            } catch (java.lang.InterruptedException e) {
            }
        }

        int clientSideAborts = 0;

        for (SeparateClassLoader client : clients)
            clientSideAborts += (Integer) client.getResult();

        for (SeparateClassLoader client : clients)
            client.dispose();

        long time = System.nanoTime() - start;
        return finish(notifier, threads, time, count, listener, entity, getChangeCallbackLast(), true, clientSideAborts, flags);
    }

    public static void main(String[] args) throws Exception {
        Distributed test = new Distributed();

        for (int i = 0; i < 100; i++) {
            test.reset();
            test.before();
            Debug.ProcessName = "Server";
            test.runSimple2();
            Debug.ProcessName = "";
            test.after();
        }
    }
}
