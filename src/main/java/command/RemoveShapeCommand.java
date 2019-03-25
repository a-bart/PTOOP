package command;

import repository.ShapeRepositories;
import repository.ShapeRepository;
import shape.Shape;
import util.ReaderUtil;

import java.util.List;

public class RemoveShapeCommand implements Command {

    private ShapeRepository shapeRepository;
    private Command getAllCommand;

    public RemoveShapeCommand() {
        this.shapeRepository = ShapeRepositories.bsonShapeRepository();
        this.getAllCommand = new ShowAllShapesCommand();
    }

    @Override
    public void execute() {
        getAllCommand.execute();
        List<Shape> shapes = shapeRepository.getAll();
        System.out.println("Enter the number of shape what you want to change:");
        int number = ReaderUtil.readNumber();
        Shape removeShape = shapes.get(number);
        shapeRepository.remove(removeShape.getId());
    }
}
