package main.command;

import main.plugin.ShapeHandlers;
import main.util.ReaderUtil;

public class ShapeHandlerCommand implements Command {

    @Override
    public void execute() {
        boolean enable = ShapeHandlers.isEnable();
        String actionText = !enable ? "enable" : "disable";
        System.out.println("Do you want to " + actionText + " shape handler?(\"yes\" or \"no\"):");
        String answer = ReaderUtil.readLine();
        switch (answer) {
            case "yes":
                ShapeHandlers.setEnable(!enable);
            case "no":
            default:
        }
    }

    @Override
    public String commandName() {
        return !ShapeHandlers.isEnable() ? "enable shape handler" : "disable shape handler";
    }
}
