package main.command;

import main.util.ShapeDrawer;
import main.repository.ShapeRepositoryFactory;
import main.repository.ShapeRepository;
import main.shape.Shape;

import java.util.List;

public class ShowAllShapesCommand implements Command {
    private ShapeRepository shapeRepository;
    private ShapeDrawer shapeDrawer;
    private String commandName = "show all shapes";

    public ShowAllShapesCommand() {
        this.shapeRepository = ShapeRepositoryFactory.bsonShapeRepository();
        this.shapeDrawer = new ShapeDrawer();
    }

    @Override
    public void execute() {
        List<Shape> allShapes = shapeRepository.getAll();
        shapeDrawer.drawAllShapes(allShapes);
    }

    @Override
    public String commandName() {
        return commandName;
    }
}
