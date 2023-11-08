package model.animals;

public enum AnimalType {
    CAMEL("верблюд"),
    CAT("кошка"),
    DOG("собака"),
    DONKEY("осел"),
    HAMSTER("хомяк"),
    HORSE("лошадь");

    private final String name;

    AnimalType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}