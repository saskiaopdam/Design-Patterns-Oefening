import product.Coke;
import product.Pepsi;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        // For Veg item.Meal with item.Coke
        vegMealBuilder.reset();  // Ensure to reset before using
        vegMealBuilder.setDrink(new Coke());
        director.construct(vegMealBuilder);
        Meal vegMealWithCoke = vegMealBuilder.getMeal();
        vegMealWithCoke.show("Veg meal with coke");

        // For Veg item.Meal with item.Pepsi
        vegMealBuilder.reset();  // Ensure to reset before using
        vegMealBuilder.setDrink(new Pepsi());
        director.construct(vegMealBuilder);
        Meal vegMealWithPepsi = vegMealBuilder.getMeal();
        vegMealWithPepsi.show("Veg meal with pepsi");

        // For Non-Veg item.Meal with item.Coke
        nonVegMealBuilder.reset();  // Ensure to reset before using
        nonVegMealBuilder.setDrink(new Coke());
        director.construct(nonVegMealBuilder);
        Meal nonVegMealWithCoke = nonVegMealBuilder.getMeal();
        nonVegMealWithCoke.show("Non-veg meal with coke");

        // For Non-Veg item.Meal with item.Pepsi
        nonVegMealBuilder.reset();  // Ensure to reset before using
        nonVegMealBuilder.setDrink(new Pepsi());
        director.construct(nonVegMealBuilder);
        Meal nonVegMealWithPepsi = nonVegMealBuilder.getMeal();
        nonVegMealWithPepsi.show("Non-veg meal with pepsi");
    }
}
