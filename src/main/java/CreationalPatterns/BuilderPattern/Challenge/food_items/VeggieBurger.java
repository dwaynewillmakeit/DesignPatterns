package CreationalPatterns.BuilderPattern.Challenge.food_items;

public class VeggieBurger extends Burger{
    @Override
    public String name() {
        return "Veggie Burger" ;
    }

    @Override
    public float price() {
        return 3.50f;
    }
}
