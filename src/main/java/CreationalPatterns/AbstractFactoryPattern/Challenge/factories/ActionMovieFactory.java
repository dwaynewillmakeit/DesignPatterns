package CreationalPatterns.AbstractFactoryPattern.Challenge.factories;

import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.BollywoodMovieInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.HollywoodMovieInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.MovieFactoryInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.models.BollywoodActionMovie;
import CreationalPatterns.AbstractFactoryPattern.Challenge.models.HollywoodActionMovie;

public class ActionMovieFactory implements MovieFactoryInterface {
    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
