package model.tricks.tricks;

public abstract class Trick {
    private String description;

    public Trick(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract String execute();
}