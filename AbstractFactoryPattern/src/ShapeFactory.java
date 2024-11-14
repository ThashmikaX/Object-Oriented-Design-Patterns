public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();    //Return a circle object
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();    //Return a square object
        }
        return null;    // Return null if no valid shape type is provided
    }

    @Override
    Color getColor(String colorType) {
        return null;    // This factory does not produce colors
    }
}
