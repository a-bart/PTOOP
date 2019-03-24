package lab3.command;

import lab3.ReaderUtil;
import lab3.ShapeDrawer;
import lab3.ShapeReaderFactory;
import lab3.repository.ShapeRepositories;
import lab3.repository.ShapeRepository;
import lab3.shape.Shape;

import java.util.List;

public class ModifyShapeCommand implements Command {

    private ShapeRepository shapeRepository;
    private Command getAllCommand;

    public ModifyShapeCommand() {
        this.shapeRepository = ShapeRepositories.bsonShapeRepository();
        this.getAllCommand = new ShowAllShapesCommand();
    }

    @Override
    public void execute() {
        getAllCommand.execute();
        List<Shape> allShapes = shapeRepository.getAll();
        System.out.println("Enter the number of shape what you want to change:");
        int number = ReaderUtil.readNumber();
        Shape shape = allShapes.get(number);
        Shape newShape = ShapeReaderFactory.reader(shape.shapeType()).readShape();
        newShape.setId(shape.getId());
        shapeRepository.remove(shape.getId());
        shapeRepository.save(newShape);
        System.out.println("Update successful");
    }
}
