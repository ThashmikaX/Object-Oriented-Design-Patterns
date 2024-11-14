//Step 5: Create an abstract factory class
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);  //Method to get shape
    abstract Color getColor(String colorType);  //Method to get color
}
