package model.tricks.tricks;

public class Wait extends Trick {
    private static final String DESCRIPTION = "Ждать";
    private static final String ACTION = "*сидит и ждет*";

    public Wait() {
        super(DESCRIPTION);
    }

    @Override
    public String execute() {
        return ACTION;
    }
}