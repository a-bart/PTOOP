package lab3.command;

import lab3.ReaderUtil;
import lab3.ShapeReaderFactory;
import lab3.repository.ShapeRepositories;
import lab3.repository.ShapeRepository;
import lab3.shape.Shape;
import lab3.shape.ShapeType;

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
