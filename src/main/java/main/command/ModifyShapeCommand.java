package main.command;

import main.ShapeDrawer;
import main.reader.ShapeReaderFactory;
import main.repository.ShapeRepositories;
import main.repository.ShapeRepository;
import main.shape.Shape;
import main.util.ReaderUtil;

import java.util.List;

public class ModifyShapeCommand implements Command {

    private ShapeRepository shapeRepository;
    private String commandName = "modify shape";
    private ShapeDrawer shapeDrawer;


    public ModifyShapeCommand() {
        this.shapeRepository = ShapeRepositories.bsonShapeRepository();
        CommandProvider.getInstance().registerCommand(this);
        shapeDrawer = new ShapeDrawer();
    }

    @Override
    public void execute() {
        while (true) {
            List<Shape> allShapes = shapeRepository.getAll();
            shapeDrawer.drawAllShapes(allShapes);
            System.out.println();
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

    @Override
    public String commandName() {
        return commandName;
    }
}
