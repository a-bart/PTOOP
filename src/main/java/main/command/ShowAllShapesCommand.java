package main.command;

import main.util.ShapeDrawer;
import main.repository.ShapeRepositories;
import main.repository.ShapeRepository;
import main.shape.Shape;

import java.util.List;

public class ShowAllShapesCommand implements Command {
    private ShapeRepository shapeRepository;
    private ShapeDrawer shapeDrawer;

    public ShowAllShapesCommand() {
        this.shapeRepository = ShapeRepositories.bsonShapeRepository();
        this.shapeDrawer = new ShapeDrawer();
    }

    @Override
    public void execute() {
        List<Shape> allShapes = shapeRepository.getAll();
        for (int i = 0; i < allShapes.size(); i++) {
            System.out.println("Shape #" + (i + 1));
            shapeDrawer.drawShape(allShapes.get(i));
            System.out.println();
        }
    }
}
