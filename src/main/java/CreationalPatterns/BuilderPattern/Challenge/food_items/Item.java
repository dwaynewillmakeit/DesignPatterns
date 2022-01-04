package CreationalPatterns.BuilderPattern.Challenge.food_items;

import CreationalPatterns.BuilderPattern.Challenge.packing_materials.Packing;

public interface Item {

    String name();
    Packing packing();
    float price();
}
