package model.tricks.tricks;

public class Voice extends Trick {
    private static final String DESCRIPTION = "Голос!";
    private static final String ACTION = "Ваф-ваф!";

    public Voice() {
        super(DESCRIPTION);
    }

    @Override
    public String execute() {
        return ACTION;
    }
}