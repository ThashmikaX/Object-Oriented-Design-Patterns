public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isShapeFactory) {
        if (isShapeFactory) {
            return new ShapeFactory(); // Return a ShapeFactory instance
        } else {
            return new ColorFactory(); // Return a ColorFactory instance
        }
    }
}