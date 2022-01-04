package CreationalPatterns.BuilderPattern.Challenge.builders;

import CreationalPatterns.BuilderPattern.Challenge.Meal;
import CreationalPatterns.BuilderPattern.Challenge.food_items.ChickenBurger;
import CreationalPatterns.BuilderPattern.Challenge.food_items.Pepsi;

public class NonVegMealBuilder implements MealBuilderInterface{

    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
