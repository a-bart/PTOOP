package lab3.command;

public class CommandFactory {
    public static Command command(CommandType commandType) {
        switch (commandType) {
            case CREATE:
                return new CreateShapeCommand();
            case REMOVE:
                return new RemoveShapeCommand();
            case UPDATE:
                return new ModifyShapeCommand();
            case GET_ALL:
                return new ShowAllShapesCommand();
            default:
                throw new IllegalArgumentException(commandType.toString());
        }
    }
}
