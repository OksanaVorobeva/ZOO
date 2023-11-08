package model.abstruct_factory.factories;

import model.animals.animal.Animal;
import model.animals.AnimalType;
import model.animals.animal.Donkey;

public class DonkeyFactory extends AnimalFactory {
    public DonkeyFactory() {
        super(AnimalType.DONKEY);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Donkey(AnimalType.DONKEY, name);
    }
}