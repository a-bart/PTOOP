package lab3.command;

import lab3.ShapeDrawer;
import lab3.repository.ShapeRepositories;
import lab3.repository.ShapeRepository;
import lab3.shape.Shape;

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
            System.out.println("Shape #" + i);
            shapeDrawer.drawShape(allShapes.get(i));
            System.out.println();
        }}
}
