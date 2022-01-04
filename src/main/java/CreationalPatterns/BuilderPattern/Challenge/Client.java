package CreationalPatterns.BuilderPattern.Challenge;

import CreationalPatterns.BuilderPattern.Challenge.builders.MealBuilderInterface;
import CreationalPatterns.BuilderPattern.Challenge.builders.NonVegMealBuilder;
import CreationalPatterns.BuilderPattern.Challenge.builders.VegMealBuilder;

public class Client {

    public static void main(String... args) {

        System.out.println("*****MEAL BUILDER DEMO*****\n\n");

        Director director = new Director();

        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        System.out.println("VEG MEAL");
        director.construct(vegMealBuilder);
        vegMealBuilder.getMeal().showItems();
        System.out.println("Cost: " + vegMealBuilder.getMeal().getCost());


        MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();
        director.construct(nonVegMealBuilder);
        vegMealBuilder.getMeal().showItems();
        System.out.println("Total Cost: " + nonVegMealBuilder.getMeal().getCost());

    }
}