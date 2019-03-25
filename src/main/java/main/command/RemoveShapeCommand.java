package main.command;

import main.repository.ShapeRepositories;
import main.repository.ShapeRepository;
import main.shape.Shape;
import main.util.ReaderUtil;

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
        while (true) {
            getAllCommand.execute();
            List<Shape> shapes = shapeRepository.getAll();
            System.out.println("Enter the number of shape what you want to remove or \'cancel\' than canceled:");
            String result = ReaderUtil.readLine();
            if ("cancel".equals(result)) {
                break;
            }
            int number = Integer.valueOf(result);
            if (number > shapes.size()) {
                continue;
            }
            Shape removeShape = shapes.get(number);
            shapeRepository.remove(removeShape.getId());
            System.out.println("Successful");
            System.out.println();
        }
    }
}
