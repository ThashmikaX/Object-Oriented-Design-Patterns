// Create a concrete implementation of the Beverage interface.
// This represents a basic coffee without any add-ons.
public class PlainCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 5.00; // Base cost
    }
}