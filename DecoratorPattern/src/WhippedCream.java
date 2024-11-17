// Create another concrete decorator for adding whipped cream to the coffee.
public class WhippedCream extends AddonDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.00; // Cost of whipped cream
    }
}