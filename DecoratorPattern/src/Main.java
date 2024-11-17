// Pseudocode:
// Demonstrate the decorator pattern by creating a coffee and dynamically adding addons.
public class Main {
    public static void main(String[] args) {
        // Start with plain coffee
        Beverage plainCoffee = new PlainCoffee();

        // Add milk
        Beverage coffeeWithMilk = new Milk(plainCoffee);

        // Add sugar
        Beverage coffeeWithMilkAndSugar = new Sugar(coffeeWithMilk);

        // Add whipped cream
        Beverage fancyCoffee = new WhippedCream(coffeeWithMilkAndSugar);

        // Print the description and cost of the final beverage
        System.out.println("Order: " + fancyCoffee.getDescription());
        System.out.println("Cost: $" + fancyCoffee.getCost());
    }
}
