package model.tricks;

import model.tricks.tricks.Jump;
import model.tricks.tricks.Trick;
import model.tricks.tricks.Voice;
import model.tricks.tricks.Wait;

import java.util.ArrayList;
import java.util.List;

public class Tricks {
    private List<Trick> tricks;

    public Tricks() {
        tricks = new ArrayList<>();
        tricks.add(new Wait());
        tricks.add(new Jump());
        tricks.add(new Voice());
    }

    public Trick getTrick(int choice) {
        if (!checkSize(choice)) {
            return null;
        }
        choice = choice - 1;
        return tricks.get(choice);
    }

    private boolean checkSize(int choice) {
        return choice >= 0 && choice < tricks.size();
    }

    public String getMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < tricks.size() + 1; i++) {
            stringBuilder.append(i);
            stringBuilder.append(". ");
            stringBuilder.append(tricks.get(i - 1).getDescription());
            stringBuilder.append("\n");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
