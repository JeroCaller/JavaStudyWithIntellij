package executer.impl;

import executer.Executer;
import hiding.type.wrong.Cat;

public class NoUpCastingExecuterImpl implements Executer {

    @Override
    public void execute() {
        //Dog dog = new Dog();
        //dog.speak();

        Cat cat = new Cat();
        cat.speak();
    }
}
