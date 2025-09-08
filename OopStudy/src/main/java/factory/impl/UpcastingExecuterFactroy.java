package factory.impl;

import executer.Executer;
import executer.impl.UpcastingExecuterImpl;
import factory.ExecuterFactory;

public class UpcastingExecuterFactroy implements ExecuterFactory {

    private static final UpcastingExecuterFactroy upcastingExecuterFactroy =
        new UpcastingExecuterFactroy();

    public static UpcastingExecuterFactroy getInstance() {
        return upcastingExecuterFactroy;
    }

    private UpcastingExecuterFactroy() {}

    @Override
    public Executer getExecutor() {
        return new UpcastingExecuterImpl();
    }
}
