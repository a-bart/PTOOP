package main.command;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class CommandProvider {
    private static Map<Integer, Command> numberCommandMap = new HashMap<>();
    private static AtomicInteger numberCommand = new AtomicInteger(1);
    private static AtomicBoolean registerCommandsIsOpen = new AtomicBoolean(true);

    private static CommandProvider instance;

    private CommandProvider() {
    }

    public static CommandProvider getInstance() {
        if (instance == null) {
            instance = new CommandProvider();
        }
        return instance;
    }

    public void registerCommand(Command command) {
        if (registerCommandsIsOpen.get())
            numberCommandMap.put(numberCommand.getAndIncrement(), command);
    }

    public Command get(Integer number) {
        registerCommandsIsOpen.set(false);
        return numberCommandMap.get(number);
    }

    public Map<Integer, Command> commands() {
        return numberCommandMap;
    }

    public Command get(Class<? extends Command> clazz) {
        return numberCommandMap.values()
                .stream()
                .filter(command -> command.getClass().equals(clazz))
                .findFirst()
                .orElse(null);
    }
}
