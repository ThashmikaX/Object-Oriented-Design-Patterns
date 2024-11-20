// Pseudo-code
// Class: Coffee
// Implements the steps specific to coffee preparation

public class Coffee extends BeverageTemplate {

    @Override
    protected void addMainIngredient() {
        System.out.println("Adding coffee powder");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
