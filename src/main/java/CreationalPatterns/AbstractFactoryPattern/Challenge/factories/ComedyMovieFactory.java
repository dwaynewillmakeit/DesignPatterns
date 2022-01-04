package CreationalPatterns.AbstractFactoryPattern.Challenge.factories;

import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.BollywoodMovieInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.HollywoodMovieInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.MovieFactoryInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.models.BollywoodComedyMovie;
import CreationalPatterns.AbstractFactoryPattern.Challenge.models.HollywoodComedyMovie;

public class ComedyMovieFactory implements MovieFactoryInterface {
    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
