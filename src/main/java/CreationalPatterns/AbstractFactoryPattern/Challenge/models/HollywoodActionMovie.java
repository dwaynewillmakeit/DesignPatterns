package CreationalPatterns.AbstractFactoryPattern.Challenge.models;

import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.HollywoodMovieInterface;

public class HollywoodActionMovie implements HollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "True lies is a Hollywood Action Movie";
    }
}
