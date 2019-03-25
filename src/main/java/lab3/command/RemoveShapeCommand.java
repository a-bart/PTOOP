package lab3.command;

import lab3.repository.ShapeRepositories;
import lab3.repository.ShapeRepository;
import lab3.shape.Shape;
import main.java.lab3.ReaderUtil;

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
