package executer.impl;

import executer.Executer;
import hiding.type.upcasting.Animal;
import hiding.type.upcasting.AnimalFactory;
import hiding.type.upcasting.impl.CatImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UpcastingExecuterImpl implements Executer {

    @Override
    public void execute() {
        exampleCreateInstanceViaFactory();
    }

    private void exampleCreateInstanceDirectly() {
        //Animal animal = new DogImpl();
        Animal animal = new CatImpl();
        animal.speak();
    }

    private void exampleCreateInstanceViaFactory() {
        AnimalFactory animalFactory = AnimalFactory.getInstance();
        //Animal animal = animalFactory.getDog();
        Animal animal = animalFactory.getCat();
        animal.speak();
    }
}
