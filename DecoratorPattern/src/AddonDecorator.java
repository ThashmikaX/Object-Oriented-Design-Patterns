// Define an abstract decorator class that implements Beverage.
// This class acts as a wrapper for a Beverage instance.
public abstract class AddonDecorator implements Beverage {
    protected Beverage beverage;

    public AddonDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost();
    }
}