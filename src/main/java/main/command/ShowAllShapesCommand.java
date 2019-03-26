package main.command;

import main.ShapeDrawer;
import main.repository.ShapeRepositories;
import main.repository.ShapeRepository;
import main.shape.Shape;

import java.util.List;

public class ShowAllShapesCommand implements Command {
    private ShapeRepository shapeRepository;
    private ShapeDrawer shapeDrawer;
    private String commandName = "show all shapes";

    public ShowAllShapesCommand() {
        this.shapeRepository = ShapeRepositories.bsonShapeRepository();
        this.shapeDrawer = new ShapeDrawer();
        CommandProvider.getInstance().registerCommand(this);
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
