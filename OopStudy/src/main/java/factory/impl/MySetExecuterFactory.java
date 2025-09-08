package factory.impl;

import executer.Executer;
import executer.impl.MySetExcecuterImpl;
import factory.ExecuterFactory;

public class MySetExecuterFactory implements ExecuterFactory {

    private static final MySetExecuterFactory instance = new MySetExecuterFactory();

    public static MySetExecuterFactory getInstance() {
        return instance;
    }

    private MySetExecuterFactory() {}

    @Override
    public Executer getExecutor() {
        return new MySetExcecuterImpl();
    }
}
