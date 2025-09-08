package factory.impl;

import executer.Executer;
import executer.impl.MyServiceExecuterImpl;
import factory.ExecuterFactory;

public class MyServiceExecuterFactory implements ExecuterFactory {

    private static final MyServiceExecuterFactory myServiceExecuterFactory =
        new MyServiceExecuterFactory();

    public static MyServiceExecuterFactory getInstance() {
        return myServiceExecuterFactory;
    }

    private MyServiceExecuterFactory() {}

    @Override
    public Executer getExecutor() {
        return new MyServiceExecuterImpl();
    }
}
