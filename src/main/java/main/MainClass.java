package main;

import main.command.Command;
import main.command.CommandProvider;
import main.util.ReaderUtil;

import java.util.List;

public class MainClass {

    public static String filepath;

    public static void main(String[] args) {
        System.out.println("Enter the path to bson file:");
        // path to bson file
        MainClass.filepath = ReaderUtil.readLine();
        CommandProvider commandProvider = CommandProvider.getInstance();
        List<Command> commands = commandProvider.commands();

        while (true) {
            System.out.println("Enter command name:");

            for (int i = 1; i <= commands.size(); i++) {
                Command command = commands.get(i - 1);
                System.out.println(i + " " + command.commandName());
            }

            String line = ReaderUtil.readLine();
            if ("exit".equals(line)) {
                System.out.println("Bye");
                break;
            }
            int number = Integer.valueOf(line);
            Command command = commandProvider.get(number-1);
            command.execute();
        }
    }
}
