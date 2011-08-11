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

package com.objectfabric.security.shiro;

import com.objectfabric.Privileged;
import com.objectfabric.generator.Generator;
import com.objectfabric.generator.ObjectModelDef;

class ShiroGenerator extends Privileged {

    public static void main(String[] args) throws Exception {
        ObjectModelDef model = ObjectModelDef.fromXMLFile("generator/com/objectfabric/security/shiro/ShiroObjectModel.xml");
        Generator generator = new Generator(model);
        generator.run("generated");
    }
}
