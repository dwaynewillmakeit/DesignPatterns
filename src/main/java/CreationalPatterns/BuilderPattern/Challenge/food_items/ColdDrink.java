package CreationalPatterns.BuilderPattern.Challenge.food_items;

import CreationalPatterns.BuilderPattern.Challenge.packing_materials.Bottle;
import CreationalPatterns.BuilderPattern.Challenge.packing_materials.Packing;
import CreationalPatterns.BuilderPattern.Challenge.packing_materials.Wrapper;

public abstract class ColdDrink implements Item{


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price() ;
}
