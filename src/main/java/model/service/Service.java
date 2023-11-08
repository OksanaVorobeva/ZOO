package model.service;

import model.abstruct_factory.Factory;
import model.animals.animal.Animal;
import model.tricks.Tricks;
import model.tricks.tricks.Trick;
import model.validator.Validator;
import model.zoo.Zoo;


public class Service {
    private Zoo zoo;
    private Factory factory;
    //TODO описать валидатор
    private Validator validator;
    private Tricks tricks;

    public Service() {
        zoo = new Zoo();
        factory = new Factory();
        tricks = new Tricks();
        validator = new Validator();
    }

    public String addAnimal(int choice, String name) {
        Animal animal = factory.createAnimal(choice, name);
        if (animal == null) {
            return "Неверно указан номер животного";
        }
        zoo.addAnimal(animal);
        return "Животное успешно добавлено";
    }

    public String getAnimalTricks(int animalNumber) {
        return zoo.getAnimalTricks(animalNumber);
    }

    public String getAnimals() {
        return zoo.getAnimals();
    }

    public String getTricks() {
        return tricks.getMenu();
    }

    public String addTrick(int animalNumber, int trickNumber) {
        Trick trick = tricks.getTrick(trickNumber);
        if (trick == null) {
            return "Неверно указан номер трюка";
        }
        zoo.addTrickForAnimal(animalNumber, trick);
        return "Трюк успешно добавлен";
    }

    public String getAnimalsForCreate() {
        return factory.getMenu();
    }

}