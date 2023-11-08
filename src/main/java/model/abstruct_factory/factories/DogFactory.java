package model.abstruct_factory.factories;

import model.animals.animal.Animal;
import model.animals.AnimalType;
import model.animals.animal.Dog;

public class DogFactory extends AnimalFactory {
    public DogFactory() {
        super(AnimalType.DOG);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Dog(AnimalType.DOG, name);
    }
}