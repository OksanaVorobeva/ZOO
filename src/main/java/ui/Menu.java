package ui;

import ui.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<Commands> commands;

    public Menu(View view) {
        commands = new ArrayList<>();
        commands.add(new AddAnimals(view));
        commands.add(new AddCommand(view));
        commands.add(new ListOfCommand(view));
        commands.add(new ListOfAnimals(view));

    }

    public void execute(int number) {
        commands.get(number - 1).execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
