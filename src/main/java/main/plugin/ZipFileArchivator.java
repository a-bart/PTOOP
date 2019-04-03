package main.plugin;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileArchivator {
    public void executeArchivation(String filepath, String outputFileName) {
        if (outputFileName == null) {
            outputFileName = "default";
        }
        File file = new File(filepath);
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(outputFileName + ".zip"))) {
            ZipEntry ze = new ZipEntry(file.getName());
            zout.putNextEntry(ze);
            Files.copy(Paths.get(file.getPath()), zout);
            zout.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
