import product.ColdDrink;
import product.VegBurger;

public class VegMealBuilder implements MealBuilder {
    private Meal meal;
    private ColdDrink coldDrink;

    public VegMealBuilder() {
        reset();
    }
    @Override
    public void buildBurger() {

        meal.addItem(new VegBurger());
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
        coldDrink = null;
    }
}
