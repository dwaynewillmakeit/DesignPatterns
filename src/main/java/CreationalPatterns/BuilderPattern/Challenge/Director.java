package CreationalPatterns.BuilderPattern.Challenge;

import CreationalPatterns.BuilderPattern.Challenge.builders.MealBuilderInterface;

public class Director {

    MealBuilderInterface myBuilder;

    public void construct(MealBuilderInterface builder){
        this.myBuilder = builder;

        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}
