package factory.impl;

import executer.Executer;
import executer.impl.NoUpCastingExecuterImpl;
import factory.ExecuterFactory;

public class NoUpCastingExecuterFactory implements ExecuterFactory {

    private static final NoUpCastingExecuterFactory noUpCastingExecuterFactory =
        new NoUpCastingExecuterFactory();

    public static NoUpCastingExecuterFactory getInstance() {
        return noUpCastingExecuterFactory;
    }

    private NoUpCastingExecuterFactory() {}

    @Override
    public Executer getExecutor() {
        return new NoUpCastingExecuterImpl();
    }
}
