package main;

import main.command.CommandFactory;
import main.command.CommandType;
import main.util.ReaderUtil;

public class MainClass {

    public static String filepath;

    public static void main(String[] args) {
        System.out.println("Enter the path to bson file:");
        MainClass.filepath = ReaderUtil.readLine();

        while (true) {
            System.out.println("Enter command name:");
            int i = 1;
            for (CommandType commandType : CommandType.values()) {
                System.out.println(i + " " + commandType.getDescription());
                i++;
            }

            String command = ReaderUtil.readLine();
            if ("exit".equals(command)) {
                System.out.println("Bye");
                break;
            }
            CommandType commandType = CommandType.of(Integer.valueOf(command));
            CommandFactory.command(commandType).execute();
        }
    }
}
