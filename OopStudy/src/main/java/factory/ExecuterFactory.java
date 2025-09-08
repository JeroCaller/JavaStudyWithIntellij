package factory;

import executer.Executer;

@FunctionalInterface
public interface ExecuterFactory {
    Executer getExecutor();
}