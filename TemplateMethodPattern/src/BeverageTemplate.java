// Pseudo-code
// Abstract class: BeverageTemplate
// Defines the template method and steps for preparing a beverage

public abstract class BeverageTemplate {

    // Template method (final to prevent overriding)
    public final void prepareBeverage() {
        boilWater();
        addMainIngredient();
        pourInCup();
        addCondiments();
    }

    // Common steps
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Steps to be implemented by subclasses
    protected abstract void addMainIngredient();
    protected abstract void addCondiments();
}
