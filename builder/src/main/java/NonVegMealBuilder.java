import product.ChickenBurger;
import product.ColdDrink;

public class NonVegMealBuilder implements MealBuilder {
    private Meal meal;
    private ColdDrink coldDrink;

    public NonVegMealBuilder() {
        reset();
    }

    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        if (coldDrink != null) {
            meal.addItem(coldDrink);
        } else {
            System.out.println("No drink set!");
        }
    }

    @Override
    public void setDrink(final ColdDrink drink) {
        this.coldDrink = drink;
    }

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void reset() {
        meal = new Meal();
        coldDrink = null;  // Reset the drink
    }

}
