///
/// This file is part of ObjectFabric (http://objectfabric.org).
///
/// ObjectFabric is licensed under the Apache License, Version 2.0, the terms
/// of which may be found at http://www.apache.org/licenses/LICENSE-2.0.html.
///
/// Copyright ObjectFabric Inc.
///
/// This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
/// WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
///

namespace ObjectFabric
{
    public class Counter : org.objectfabric.Counter, TObject
    {
        public Counter(Resource resource)
            : base(resource)
        {
        }

        public Resource Resource
        {
            get { return (Resource) resource(); }
        }

        public Workspace Workspace
        {
            get { return (Workspace) workspace(); }
        }

        public long Value
        {
            get { return get(); }
        }

        public void Add(long delta)
        {
            add(delta);
        }

        public void Reset()
        {
            reset();
        }

        // TODO add listener
    }
}