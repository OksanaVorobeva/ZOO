package model.abstruct_factory.factories;

import model.animals.animal.Animal;
import model.animals.AnimalType;
import model.animals.animal.Cat;

public class CatFactory extends AnimalFactory {
    public CatFactory() {
        super(AnimalType.CAT);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Cat(AnimalType.CAT, name);
    }

}
