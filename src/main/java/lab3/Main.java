package main.java.lab3;


import main.java.lab3.command.CommandFactory;
import main.java.lab3.command.CommandType;

public class Main {
    public static void main(String[] args) {
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
