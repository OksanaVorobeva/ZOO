package ui.commands;

import ui.View;

public class AddAnimals implements Commands {
    private View view;


    public AddAnimals(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.addAnimals();
    }

    @Override
    public String description() {

        return "добавить животное";
    }
}
