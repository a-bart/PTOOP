package main;

import main.command.Command;
import main.command.CommandProvider;
import main.util.ReaderUtil;

import java.util.List;

public class MainClass {

    public static String filepath = "/Users/alexeybartashevich/Dev/Univer/PTOOP/storage/base.bson";

    public static void main(String[] args) {
        System.out.println("Enter the path to bson file (or leave empty to use default):");
        String newFilepath = ReaderUtil.readLine();
        if (newFilepath != null && !newFilepath.isEmpty()) {
            MainClass.filepath = newFilepath;
        } else {
            System.out.println("Will use default path: " + MainClass.filepath);
        }
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
