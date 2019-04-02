package main.command;

import main.util.ShapeDrawer;
import main.repository.ShapeRepositoryFactory;
import main.repository.ShapeRepository;
import main.shape.Shape;
import main.util.ReaderUtil;

import java.util.List;

public class RemoveShapeCommand implements Command {

    private ShapeRepository shapeRepository;
    private ShapeDrawer shapeDrawer;
    private String commandName = "remove shape";

    public RemoveShapeCommand() {
        this.shapeRepository = ShapeRepositoryFactory.bsonShapeRepository();
        this.shapeDrawer = new ShapeDrawer();
    }

    @Override
    public void execute() {
        while (true) {
            List<Shape> shapes = shapeRepository.getAll();
            shapeDrawer.drawAllShapes(shapes);
            System.out.println();
            System.out.println("Enter the number of shape what you want to remove or \'cancel\' than canceled:");
            String result = ReaderUtil.readLine();
            if ("cancel".equals(result)) {
                break;
            }
            int number = Integer.valueOf(result);
            if (number > shapes.size()) {
                continue;
            }
            Shape removeShape = shapes.get(number - 1);
            shapeRepository.remove(removeShape.getId());
            System.out.println("Successful");
            System.out.println();
            break;
        }
    }

    @Override
    public String commandName() {
        return commandName;
    }
}
