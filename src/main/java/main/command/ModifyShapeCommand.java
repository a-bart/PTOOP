package main.command;

import main.reader.ShapeReaderFactory;
import main.repository.ShapeRepositories;
import main.repository.ShapeRepository;
import main.shape.Shape;
import main.util.ReaderUtil;

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
        while (true) {
            getAllCommand.execute();
            List<Shape> allShapes = shapeRepository.getAll();
            System.out.println("Enter the number of shape what you want to change or \'cancel\' than canceled:");
            String result = ReaderUtil.readLine();
            if ("cancel".equals(result)) {
                break;
            }
            int number = Integer.valueOf(result);
            if (number > allShapes.size()) {
                continue;
            }
            Shape shape = allShapes.get(number - 1);
            Shape newShape = ShapeReaderFactory.reader(shape.getShapeType()).readShape();
            newShape.setId(shape.getId());
            shapeRepository.update(newShape);
            System.out.println("Update successful");
        }
    }
}
