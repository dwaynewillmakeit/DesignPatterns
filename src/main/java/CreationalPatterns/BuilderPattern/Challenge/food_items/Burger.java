package CreationalPatterns.BuilderPattern.Challenge.food_items;

import CreationalPatterns.BuilderPattern.Challenge.packing_materials.Packing;
import CreationalPatterns.BuilderPattern.Challenge.packing_materials.Wrapper;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
