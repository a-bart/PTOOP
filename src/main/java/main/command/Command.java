package main.command;

public interface Command {
    void execute();

    String commandName();
}
