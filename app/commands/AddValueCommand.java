package commands;

public class AddValueCommand {

    private final String value;

    public AddValueCommand(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
