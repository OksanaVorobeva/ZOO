package model.abstruct_factory.factories;

import model.animals.animal.Animal;
import model.animals.AnimalType;


public abstract class AnimalFactory {
    private AnimalType type;

    public AnimalFactory(AnimalType type) {
        this.type = type;
    }

    public abstract Animal createAnimal(String name);

    public String getAnimalName() {
        return type.getName();
    }
}

