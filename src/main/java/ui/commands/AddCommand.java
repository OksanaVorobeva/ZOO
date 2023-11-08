package ui.commands;

import ui.View;

public class AddCommand implements Commands {
    View view;

    public AddCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.addCommand();
    }

    @Override
    public String description() {
        return "добавить команду";
    }
}
