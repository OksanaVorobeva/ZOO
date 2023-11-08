package ui.commands;

import ui.View;

public class ListOfAnimals implements Commands {
    View view;

    public ListOfAnimals(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.listOfAnimals();
    }

    @Override
    public String description() {
        return "Список животных";
    }
}
