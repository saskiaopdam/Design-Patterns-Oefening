public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();

        // making veg meal
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        // making non-veg meal
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
