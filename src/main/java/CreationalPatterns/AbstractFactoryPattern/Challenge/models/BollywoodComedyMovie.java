package CreationalPatterns.AbstractFactoryPattern.Challenge.models;

import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.BollywoodMovieInterface;

public class BollywoodComedyMovie implements BollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "Munna is a Bollywood action movie";
    }
}
