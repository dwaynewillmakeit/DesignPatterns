package CreationalPatterns.BuilderPattern.Challenge.packing_materials;

import CreationalPatterns.BuilderPattern.Challenge.packing_materials.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
