package CreationalPatterns.BuilderPattern.Challenge.builders;

import CreationalPatterns.BuilderPattern.Challenge.Meal;

public interface MealBuilderInterface {

    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
