package model.abstruct_factory.factories;

import model.animals.animal.Animal;
import model.animals.AnimalType;
import model.animals.animal.Camel;

public class CamelFactory extends AnimalFactory {
    public CamelFactory() {
        super(AnimalType.CAMEL);
    }


    public Animal createAnimal(String name) {
        return new Camel(AnimalType.CAMEL, name);
    }


}
