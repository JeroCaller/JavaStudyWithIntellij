import executer.Executer;
import factory.ExecuterFactory;
import factory.impl.NoUpCastingExecuterFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ExecuterFactory executerFactory = NoUpCastingExecuterFactory.getInstance();
        Executer executer = executerFactory.getExecutor();
        executer.execute();
    }
}
