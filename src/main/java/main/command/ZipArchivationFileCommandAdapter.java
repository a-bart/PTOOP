package main.command;

import main.MainClass;
import main.plugin.ZipFileArchivator;

public class ZipArchivationFileCommandAdapter implements Command {

    private ZipFileArchivator zipFileArchivator;

    public ZipArchivationFileCommandAdapter() {
        this.zipFileArchivator = new ZipFileArchivator();
    }

    @Override
    public void execute() {
        zipFileArchivator.executeArchivation(MainClass.filepath);
    }

    @Override
    public String commandName() {
        return "archivation file";
    }
}
