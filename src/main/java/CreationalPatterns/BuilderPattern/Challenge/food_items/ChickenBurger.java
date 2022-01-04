package CreationalPatterns.BuilderPattern.Challenge.food_items;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 4.50f;
    }
}
