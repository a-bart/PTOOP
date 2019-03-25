package command;

public enum CommandType {
    CREATE("create shape"),
    UPDATE("modify shape"),
    REMOVE("remove shape"),
    GET_ALL("show all shapes");

    private String description;

    CommandType(String s) {
        this.description = s;
    }

    public String getDescription() {
        return description;
    }

    public static CommandType of(int number) {
        if (number < 1 || number > CommandType.values().length) {
            throw new IllegalArgumentException("write correct number");
        }
        return CommandType.values()[number - 1];
    }
}
