package CreationalPatterns.BuilderPattern.Challenge.food_items;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.75f;
    }
}
