package main.command;

import main.plugin.ShapePlugins;
import main.util.ReaderUtil;

public class ShapeHandlerCommand implements Command {

    @Override
    public void execute() {
        boolean enable = ShapePlugins.isEnable();
        String actionText = !enable ? "enable" : "disable";
        System.out.println("Do you want to " + actionText + " shape handler?(\"yes\" or \"no\"):");
        String answer = ReaderUtil.readLine();
        switch (answer) {
            case "yes":
                ShapePlugins.setEnable(!enable);
            case "no":
            default:
        }
    }

    @Override
    public String commandName() {
        return !ShapePlugins.isEnable() ? "enable shape handler" : "disable shape handler";
    }
}
