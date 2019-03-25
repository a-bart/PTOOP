package command;

import ShapeReaderFactory;
import repository.ShapeRepositories;
import repository.ShapeRepository;
import shape.Shape;
import shape.ShapeType;
import util.ReaderUtil;

public class CreateShapeCommand implements Command {

    private ShapeRepository shapeRepository;

    CreateShapeCommand() {
        this.shapeRepository = ShapeRepositories.bsonShapeRepository();
    }

    @Override
    public void execute() {
        System.out.println("Enter the number of shape");
        System.out.println("1. Circle");
        System.out.println("2. Cube");
        System.out.println("3. Rectangle");
        System.out.println("4. Square");
        System.out.println("5. Triangle");
        System.out.println("6. Parallelogram");

        String line = ReaderUtil.readLine();
        if ("exit".equals(line)) return;
        try {
            int number = Integer.valueOf(line);
            Shape shape = ShapeReaderFactory.reader(ShapeType.of(number)).readShape();
            shapeRepository.save(shape);
            System.out.println("Creating shape is successful\n");
        } catch (NumberFormatException ex) {
            System.out.println("Enter the number:");
        } catch (Exception e) {
            System.out.println("Error during save shape");
        }
    }
}
