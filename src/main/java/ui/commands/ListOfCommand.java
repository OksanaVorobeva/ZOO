package ui.commands;

import ui.View;

public class ListOfCommand implements Commands {
    View view;

    public ListOfCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.listOfCommand();
    }

    @Override
    public String description() {
        return "Список команд";
    }
}
