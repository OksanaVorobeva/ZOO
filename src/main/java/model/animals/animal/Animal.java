package model.animals.animal;

import model.animals.AnimalType;
import model.tricks.tricks.Trick;
import java.util.HashSet;
import java.util.Set;

public abstract class Animal {
    private AnimalType animalType;
    private String name;
    private Set<Trick> tricks;

    public Animal(AnimalType animalType, String name) {
        this.animalType = animalType;
        this.name = name;
        tricks = new HashSet<>();
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public String getName() {
        return name;
    }

    public void addTrick(Trick trick) {
        tricks.add(trick);
    }

    public String getTricks() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Я умею:\n");
        for (Trick trick : tricks) {
            stringBuilder.append(trick.getDescription());
            stringBuilder.append("\n");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
