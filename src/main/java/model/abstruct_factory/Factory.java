package model.abstruct_factory;

import model.abstruct_factory.factories.*;
import model.animals.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    private List<AnimalFactory> animalFactories;

    public Factory() {
        animalFactories = new ArrayList<>();
        animalFactories.add(new CamelFactory());
        animalFactories.add(new CatFactory());
        animalFactories.add(new DogFactory());
        animalFactories.add(new DonkeyFactory());
        animalFactories.add(new HamsterFactory());
        animalFactories.add(new HorseFactory());
    }

    public Animal createAnimal(int choice, String name) {
        if (!checkSize(choice)) {
            return null;
        }
        choice = choice - 1;
        AnimalFactory factory = animalFactories.get(choice);
        return factory.createAnimal(name);
    }

    private boolean checkSize(int choice) {
        return choice >= 0 && choice < animalFactories.size();
    }

    public String getMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < animalFactories.size() + 1; i++) {
            stringBuilder.append(i);
            stringBuilder.append(". ");
            stringBuilder.append(animalFactories.get(i - 1).getAnimalName());
            stringBuilder.append("\n");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
