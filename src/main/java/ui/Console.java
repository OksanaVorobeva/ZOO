package ui;

import presenter.Presenter;


import java.util.Scanner;

public class Console implements View {
    private final Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work = true;

    public Console() {
        menu = new Menu(this);
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public void addAnimals() {
        presenter.getAnimalsForCreate();
        System.out.println("Выберите животное");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        presenter.addAnimal(num, name);
    }

    public void listOfAnimals() {
        presenter.getAnimals();
    }


    public void listOfCommand() {
        presenter.getAnimals();
        System.out.println("Выберите животное");
        int num = scanner.nextInt();
        scanner.nextLine();
        presenter.getAnimalTricks(num);

    }


    public void addCommand() {
        presenter.getAnimals();
        System.out.println("Выберите животное");
        int num = scanner.nextInt();
        scanner.nextLine();
        presenter.getTricks();
        int num1 = scanner.nextInt();
        scanner.nextLine();
        presenter.addTrick(num, num1);
    }

 /*   @Override
    public void setPresenter(Presenter presenter) {
        this.presenter=presenter;
    }*/

    @Override
    public void start() {
        while ((work)) {
            System.out.println(menu.printMenu());
            int number = Integer.parseInt(scanner.nextLine());
            menu.execute(number);
        }
    }
}
