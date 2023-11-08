package presenter;


import model.service.Service;
import ui.View;


public class Presenter {
    private View view;
    private final Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    /**
     * Команда для добавления нового животного
     *
     * @param choice номер типа животного, который надо создать
     * @param name   имя для нового животного
     */
    public void addAnimal(int choice, String name) {
        view.printAnswer(service.addAnimal(choice, name));
    }

    /**
     * Предоставляет список изученных трюков животного
     *
     * @param animalNumber номер животного, трюки которого интересуют
     */
    public void getAnimalTricks(int animalNumber) {
        view.printAnswer(service.getAnimalTricks(animalNumber));


    }

    /**
     * Предоставляет список всех имеющихся животных
     */
    public void getAnimals() {
        view.printAnswer(service.getAnimals());
    }

    /**
     * Предоставляет список возможных трюков для изучения
     */
    public void getTricks() {
        view.printAnswer(service.getTricks());
    }

    /**
     * Добавляет животному новый трюк
     *
     * @param animalNumber номер животного, которому собираемся добавить новый трюк
     * @param trickNumber  номер типа трюка, который собираемся добавить животному
     */
    public void addTrick(int animalNumber, int trickNumber) {
        view.printAnswer(service.addTrick(animalNumber, trickNumber));
    }

    /**
     * Предоставляет список возможных вариантов животных для создания
     */
    public void getAnimalsForCreate() {
        view.printAnswer(service.getAnimalsForCreate());
    }
}
