package main.command;

import main.reader.ShapeReaderProvider;
import main.repository.ShapeRepositoryFactory;
import main.repository.ShapeRepository;
import main.shape.Shape;
import main.util.ReaderUtil;

import java.util.List;

public class CreateShapeCommand implements Command {

    private ShapeRepository shapeRepository;
    private String commandName = "create shape";

    CreateShapeCommand() {
        this.shapeRepository = ShapeRepositoryFactory.bsonShapeRepository();
    }

    @Override
    public void execute() {
        List<String> readers = ShapeReaderProvider.readers();

        for (int i = 1; i <= readers.size(); i++) {
            String readerName = readers.get(i - 1);
            System.out.println(i + " " + readerName);
        }

        String line = ReaderUtil.readLine();
        if ("exit".equals(line)) return;
        try {
            int number = Integer.valueOf(line);
            Shape shape = ShapeReaderProvider.reader(number - 1).readShape();
            shapeRepository.save(shape);
            System.out.println("Creating shape is successful\n");
        } catch (NumberFormatException ex) {
            System.out.println("Enter the number:");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String commandName() {
        return commandName;
    }
}
