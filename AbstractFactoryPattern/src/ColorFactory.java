public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String colorType) {
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();    //Return a red object
        } else if (colorType.equalsIgnoreCase("Blue")) {
            return new Blue();    //Return a blue object
        }
        return null;    // Return null if no valid color type is provided
    }

    @Override
    Shape getShape(String shapeType) {
        return null;    // This factory does not produce shapes
    }
}
