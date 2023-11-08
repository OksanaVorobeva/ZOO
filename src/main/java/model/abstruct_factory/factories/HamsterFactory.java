package model.abstruct_factory.factories;

import model.animals.animal.Animal;
import model.animals.AnimalType;
import model.animals.animal.Hamster;

public class HamsterFactory extends AnimalFactory {
    public HamsterFactory() {
        super(AnimalType.HAMSTER);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Hamster(AnimalType.HAMSTER, name);
    }

}