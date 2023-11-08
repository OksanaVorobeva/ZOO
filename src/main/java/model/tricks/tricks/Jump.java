package model.tricks.tricks;

public class Jump extends Trick {
    private static final String DESCRIPTION = "Прыжок";
    private static final String ACTION = "*Прыг-скок*";

    public Jump() {
        super(DESCRIPTION);
    }

    @Override
    public String execute() {
        return ACTION;
    }
}