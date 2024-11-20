// Pseudo-code
// Class: Tea
// Implements the steps specific to tea preparation

public class Tea extends BeverageTemplate {

    @Override
    protected void addMainIngredient() {
        System.out.println("Adding tea leaves");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
