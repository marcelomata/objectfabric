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
package of4gwt;

import of4gwt.misc.*;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

class TIndexedBase extends TObject.UserTObject {

    protected TIndexedBase(TObject.Version shared, Transaction trunk) {
        super(shared, trunk);
    }

    /*
     * TIndexed32.
     */

    protected final TIndexed32Version getTIndexed32Version_objectfabric(Transaction current, int index) {
        if (Debug.ENABLED)
            Debug.assertion(!current.isPublic());

        TIndexed32Version version = (TIndexed32Version) current.getVersionFromTObject(this);

        /*
         * If we have already written to this field, use this.
         */
        if (version != null && version.getBit(index))
            return version;

        version = findTIndexed32PrivateVersion(current.getPrivateSnapshotVersions(), index);

        /*
         * Same if it was in a private snapshot.
         */
        if (version != null)
            return version;

        /*
         * Otherwise keep track of read and find previous value.
         */
        if (!current.noReads()) {
            TIndexed32Read read = (TIndexed32Read) current.getRead(this);

            if (read == null) {
                read = (TIndexed32Read) getSharedVersion_objectfabric().createRead();

                if (read != null)
                    current.putRead(this, read);
                else if (Debug.ENABLED)
                    Debug.assertion(this instanceof UserTObject.Method);
            }

            if (read != null)
                read.setBit(index);
        }

        return findTIndexed32PublicVersion(current, index);
    }

    private final TIndexed32Version findTIndexed32PrivateVersion(Version[][] versions, int index) {
        if (versions != null) {
            for (int i = versions.length - 1; i >= 0; i--) {
                TIndexed32Version version = (TIndexed32Version) TransactionSets.getVersionFromTObject(versions[i], this);

                if (version != null && version.getBit(index))
                    return version;
            }
        }

        return null;
    }

    final TIndexed32Version findTIndexed32PublicVersion(Transaction transaction, int index) {
        for (int i = transaction.getPublicSnapshotVersions().length - 1; i > TransactionManager.OBJECTS_VERSIONS_INDEX; i--) {
            TObject.Version[] delta = transaction.getPublicSnapshotVersions()[i];
            TIndexed32Version version = (TIndexed32Version) TransactionSets.getVersionFromTObject(delta, this);

            if (version != null && version.getBit(index))
                return version;
        }

        return (TIndexed32Version) getSharedVersion_objectfabric();
    }

    /*
     * TIndexedN.
     */

    protected final TIndexedNVersion getTIndexedNVersion_objectfabric(Transaction current, int index) {
        if (Debug.ENABLED)
            Debug.assertion(!current.isPublic());

        TIndexedNVersion version = (TIndexedNVersion) current.getVersionFromTObject(this);

        /*
         * If we have already written to this field, use this.
         */
        if (version != null && version.getBit(index))
            return version;

        version = findTIndexedNPrivateVersion(current.getPrivateSnapshotVersions(), index);

        /*
         * Same if it was in a private snapshot.
         */
        if (version != null)
            return version;

        /*
         * Otherwise keep track of read and find previous value.
         */
        if (!current.noReads()) {
            TIndexedNRead read = (TIndexedNRead) current.getRead(this);

            if (read == null) {
                read = (TIndexedNRead) getSharedVersion_objectfabric().createRead();

                if (read != null)
                    current.putRead(this, read);
                else if (Debug.ENABLED)
                    Debug.assertion(this instanceof UserTObject.Method);
            }

            if (read != null)
                read.setBit(index);
        }

        return findTIndexedNPublicVersion(current, index);
    }

    private final TIndexedNVersion findTIndexedNPrivateVersion(Version[][] versions, int index) {
        if (versions != null) {
            for (int i = versions.length - 1; i >= 0; i--) {
                TIndexedNVersion version = (TIndexedNVersion) TransactionSets.getVersionFromTObject(versions[i], this);

                if (version != null && version.getBit(index))
                    return version;
            }
        }

        return null;
    }

    final TIndexedNVersion findTIndexedNPublicVersion(Transaction transaction, int index) {
        for (int i = transaction.getPublicSnapshotVersions().length - 1; i > TransactionManager.OBJECTS_VERSIONS_INDEX; i--) {
            TObject.Version[] delta = transaction.getPublicSnapshotVersions()[i];
            TIndexedNVersion version = (TIndexedNVersion) TransactionSets.getVersionFromTObject(delta, this);

            if (version != null && version.getBit(index))
                return version;
        }

        return (TIndexedNVersion) getSharedVersion_objectfabric();
    }
}
