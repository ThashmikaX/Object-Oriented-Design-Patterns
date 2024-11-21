// Pseudo-code
// Class: Client
// Demonstrates the usage of the Template Design Pattern for beverages

public class Main {
    public static void main(String[] args) {
        System.out.println("Preparing Tea:");
        BeverageTemplate tea = new Tea();
        tea.prepareBeverage();

        System.out.println("\nPreparing Coffee:");
        BeverageTemplate coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
