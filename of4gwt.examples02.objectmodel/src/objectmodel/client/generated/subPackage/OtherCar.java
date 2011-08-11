
package objectmodel.client.generated.subPackage;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access" })
public class OtherCar extends of4gwt.TGeneratedFields32 {

    public OtherCar() {
        this(of4gwt.Transaction.getDefaultTrunk());
    }

    public OtherCar(of4gwt.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected OtherCar(of4gwt.TObject.Version shared, of4gwt.Transaction trunk) {
        super(shared, trunk);
    }

    public static final of4gwt.TType TYPE = new of4gwt.TType(objectmodel.client.generated.MyObjectModel.getInstance(), objectmodel.client.generated.MyObjectModel.OBJECTMODEL_CLIENT_GENERATED_SUBPACKAGE_OTHERCAR_CLASS_ID);

    public static final int FIELD_COUNT = 0;

    @Override
    public int getFieldCount() {
        return FIELD_COUNT;
    }

    @Override
    public java.lang.String getFieldName(int index) {
        return getFieldNameStatic(index);
    }

    @SuppressWarnings("static-access")
    public static java.lang.String getFieldNameStatic(int index) {
        switch (index) {
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public java.lang.Class getFieldClass(int index) {
        return getFieldClassStatic(index);
    }

    @SuppressWarnings("static-access")
    public static java.lang.Class getFieldClassStatic(int index) {
        switch (index) {
            default:
                throw new IllegalArgumentException();
        }
    }

    // Methods

    protected static final int METHOD_0 = 0;
    /**
     * Asynchronous version.
     */
    public final of4gwt.misc.Future<java.lang.Void> openOtherWindowAsync(int height, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback) {
        return openOtherWindowAsync(height, callback, getDefaultAsyncOptions_objectfabric(), getDefaultMethodExecutor_objectfabric());
    }

    /**
     * Asynchronous version, with options for the callback.
     */
    public final of4gwt.misc.Future<java.lang.Void> openOtherWindowAsync(int height, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback, of4gwt.AsyncOptions asyncOptions) {
        return openOtherWindowAsync(height, callback, asyncOptions, getDefaultMethodExecutor_objectfabric());
    }

    /**
     * Asynchronous version, with options for the callback, and specifies the Executor or TaskScheduler that will run the method. For replicated objects,
     * the method runs by default on the site the object has been created. @see Site.getMethodExecutor() to specify an execution site.
     */
    public final of4gwt.misc.Future<java.lang.Void> openOtherWindowAsync(int height, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback, of4gwt.AsyncOptions asyncOptions, of4gwt.misc.Executor executor) {
        if (executor == of4gwt.misc.TransparentExecutor.getInstance()) {
            java.lang.Void result_ = null;
            java.lang.Throwable throwable_ = null;

            try {
                openOtherWindowImplementation(height);
            } catch (java.lang.Throwable t_) {
                throwable_ = t_;
            }

            return getCompletedFuture_objectfabric(result_, throwable_, callback, asyncOptions);
        } else {
            objectmodel.client.generated.MyObjectModel.Method4.Version version_ = (objectmodel.client.generated.MyObjectModel.Method4.Version) createVersion_objectfabric(objectmodel.client.generated.MyObjectModel.Method4.INSTANCE);

            if (height != 0) {
                version_._height = height;
                version_.setBit(objectmodel.client.generated.MyObjectModel.Method4.HEIGHT_INDEX);
            }

            of4gwt.TObject.UserTObject.LocalMethodCall call_ = new of4gwt.TObject.UserTObject.LocalMethodCall(this, objectmodel.client.generated.MyObjectModel.Method4.INSTANCE, version_, METHOD_0, callback, asyncOptions);
            executor.execute(call_);
            return call_;
        }
    }

    /**
     * Override to implement the method.
     */
    protected void openOtherWindowImplementation(int height) {
        throw new RuntimeException(of4gwt.Strings.MISSING_METHOD_CALL_IMPLEMENTATION);
    }

    /**
     * Override to implement the method asynchronously.
     */
    protected void openOtherWindowImplementationAsync(int height, of4gwt.MethodCall call) {
        try {
            openOtherWindowImplementation(height);
            call.set(null);
        } catch (java.lang.Throwable t_) {
            call.setException(t_);
        }
    }

    @SuppressWarnings({ "static-access", "cast" })
    @Override
    protected void invoke_objectfabric(of4gwt.MethodCall call) {
        switch (getMethodCallIndex_objectfabric(call)) {
            case METHOD_0: {
                objectmodel.client.generated.MyObjectModel.Method4.Version version_ = (objectmodel.client.generated.MyObjectModel.Method4.Version) getMethodVersion_objectfabric(call);
                int height = version_ != null ? (int) version_._height : 0;

                try {
                    openOtherWindowImplementationAsync(height, call);
                } catch (java.lang.Throwable t_) {
                    call.setException(t_);
                }

                break;
            }
            default: {
                super.invoke_objectfabric(call);
                break;
            }
        }
    }

    @SuppressWarnings({ "static-access", "cast" })
    @Override
    protected void setResult_objectfabric(of4gwt.TObject.Version version, int index, java.lang.Object result) {
        switch (index) {
            case METHOD_0: {
                break;
            }
            default: {
                super.setResult_objectfabric(version, index, result);
                break;
            }
        }
    }

    @SuppressWarnings("static-access")
    @Override
    protected void setError_objectfabric(of4gwt.TObject.Version version, int index, java.lang.String error) {
        switch (index) {
            case METHOD_0: {
                ((objectmodel.client.generated.MyObjectModel.Method4.Version) version)._error_objectfabric = error;
                ((objectmodel.client.generated.MyObjectModel.Method4.Version) version).setBit(objectmodel.client.generated.MyObjectModel.Method4.ERROR_OBJECTFABRIC_INDEX);
                break;
            }
            default: {
                super.setError_objectfabric(version, index, error);
                break;
            }
        }
    }

    @SuppressWarnings("static-access")
    @Override
    protected void getResultOrError_objectfabric(of4gwt.MethodCall call) {
        switch (getMethodCallIndex_objectfabric(call)) {
            case METHOD_0: {
                objectmodel.client.generated.MyObjectModel.Method4.Version version = (objectmodel.client.generated.MyObjectModel.Method4.Version) getMethodVersion_objectfabric(call);

                if (version == null || version._error_objectfabric == null)
                    setDirect(call, null);
                else
                    setExceptionDirect(call, new of4gwt.misc.ReplicatedException(version._error_objectfabric));

                break;
            }
            default: {
                super.getResultOrError_objectfabric(call);
                break;
            }
        }
    }

    protected static class Version extends of4gwt.TGeneratedFields32.Version {

        static {
        }

        public Version(of4gwt.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public of4gwt.TObject.Version merge(of4gwt.TObject.Version target, of4gwt.TObject.Version next, int flags) {
            OtherCar.Version merged = (OtherCar.Version) super.merge(target, next, flags);
            return merged;
        }

        @Override
        public void writeWrite(of4gwt.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
                default: {
                    super.writeWrite(writer, index);

                    if (writer.interrupted()) {
                        writer.interrupt(null);
                        return;
                    }
                    break;
                }
            }
        }

        @Override
        public void readWrite(of4gwt.Reader reader, int index) {
            if (reader.interrupted())
                reader.resume();

            switch (index) {
                default: {
                    super.readWrite(reader, index);

                    if (reader.interrupted()) {
                        reader.interrupt(null);
                        return;
                    }
                    break;
                }
            }
        }

        @Override
        public of4gwt.TObject.Version createVersion() {
            return new OtherCar.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return objectmodel.client.generated.MyObjectModel.OBJECTMODEL_CLIENT_GENERATED_SUBPACKAGE_OTHERCAR_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public of4gwt.ObjectModel getObjectModel() {
            return objectmodel.client.generated.MyObjectModel.getInstance();
        }
    }
}
