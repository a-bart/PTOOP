package main;

import main.command.Command;
import main.command.CommandProvider;
import main.util.ReaderUtil;
import java.util.Comparator;
import java.util.Map;

public class MainClass {

    public static String filepath;

    public static void main(String[] args) {
        System.out.println("Enter the path to bson file:");
        MainClass.filepath = ReaderUtil.readLine();
        CommandProvider commandProvider = CommandProvider.getInstance();
        Map<Integer, Command> commands = commandProvider.commands();

        while (true) {
            System.out.println("Enter command name:");

            commands.entrySet()
                    .stream()
                    .sorted(Comparator.comparing(Map.Entry::getKey))
                    .forEach(integerCommandEntry -> {
                        System.out.println(integerCommandEntry.getKey() + " " + integerCommandEntry.getValue().commandName());
                    });

            String command = ReaderUtil.readLine();
            if ("exit".equals(command)) {
                System.out.println("Bye");
                break;
            }

        }
    }
}
