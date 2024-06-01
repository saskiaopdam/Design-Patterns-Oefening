import product.ColdDrink;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    void setDrink(ColdDrink drink);
    Meal getMeal();
    void reset();
}



