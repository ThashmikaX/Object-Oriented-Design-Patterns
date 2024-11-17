// Create a concrete decorator for adding milk to the coffee.
public class Milk extends AddonDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.50; // Cost of milk
    }
}