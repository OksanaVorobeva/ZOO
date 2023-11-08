package model.abstruct_factory.factories;

import model.animals.animal.Animal;
import model.animals.AnimalType;
import model.animals.animal.Horse;

public class HorseFactory extends AnimalFactory {
    public HorseFactory() {
        super(AnimalType.HORSE);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Horse(AnimalType.HORSE, name);
    }
}
