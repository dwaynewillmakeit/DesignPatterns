package CreationalPatterns.BuilderPattern.Challenge.builders;

import CreationalPatterns.BuilderPattern.Challenge.Meal;
import CreationalPatterns.BuilderPattern.Challenge.food_items.Coke;
import CreationalPatterns.BuilderPattern.Challenge.food_items.VeggieBurger;

public class VegMealBuilder implements MealBuilderInterface{

    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VeggieBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
