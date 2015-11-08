package pl.comarch.patterns.construct.bulider;

/**
 * Created by Asia on 2015-11-03.
 */
public class BuldingPatternDemo {
    public static void main(String[] args) {

        MealBulider mealBuilder = new MealBulider();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}