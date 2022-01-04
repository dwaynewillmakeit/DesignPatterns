package CreationalPatterns.AbstractFactoryPattern.Challenge.models;

import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.BollywoodMovieInterface;

public class BollywoodActionMovie implements BollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "Bang is a Bollywood Action Movie";
    }
}
