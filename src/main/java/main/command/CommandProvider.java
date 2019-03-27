package main.command;

import org.reflections.Reflections;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CommandProvider {
    private static List<Command> commands;
    private static CommandProvider instance;

    private CommandProvider() {
    }

    static {
        Reflections reflections = new Reflections("");
        commands = reflections.getSubTypesOf(Command.class)
                .stream()
                .map(aClass -> {
                    try {
                        return (Command) Class.forName(aClass.getName()).newInstance();
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                        System.out.println("Error during load class: " + aClass.getName());
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Command::commandName))
                .collect(Collectors.toList());
    }

    public static CommandProvider getInstance() {
        if (instance == null) {
            instance = new CommandProvider();
        }
        return instance;
    }

    public Command get(Integer number) {
        return commands.get(number);
    }

    public List<Command> commands() {
        return commands;
    }
}
