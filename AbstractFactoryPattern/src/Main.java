// Step 8: Demonstrate the usage of Abstract Factory Pattern in a client code
public class Main {
    public static void main(String[] args) {
        // Get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);

        // Get an object of Shape Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Shape Square and call its draw method
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        // Get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory(false);

        // Get an object of Color Red and call its fill method
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        // Get an object of Color Blue and call its fill method
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
    }
}