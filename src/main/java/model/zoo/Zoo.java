package model.zoo;

import model.animals.animal.Animal;
import model.tricks.tricks.Trick;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();

    }

    public boolean addAnimal(Animal animal) {
        animals.add(animal);
        return true;
    }

    public String getAnimalTricks(int animalNumber) {
        Animal animal = animals.get(animalNumber - 1);
        return animal.getTricks();
    }

    public void addTrickForAnimal(int animalNumber, Trick trick) {
        Animal animal = animals.get(animalNumber - 1);
        animal.addTrick(trick);
    }

    public String getAnimals() {
        if (animals.size() == 0) {
            return "Список животных пуст";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список животных:\n");
        for (int i = 1; i < animals.size() + 1; i++) {
            Animal animal = animals.get(i - 1);
            stringBuilder.append(i);
            stringBuilder.append(". ");
            stringBuilder.append(animal.getName());
            stringBuilder.append("(");
            stringBuilder.append(animal.getAnimalType());
            stringBuilder.append(")");
            stringBuilder.append("\n");
        }

        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}