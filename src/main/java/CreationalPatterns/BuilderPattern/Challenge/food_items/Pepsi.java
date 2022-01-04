package CreationalPatterns.BuilderPattern.Challenge.food_items;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.50f;
    }
}
