package CreationalPatterns.AbstractFactoryPattern.Challenge.models;

import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.HollywoodMovieInterface;

public class HollywoodComedyMovie implements HollywoodMovieInterface {

    @Override
    public String getMovieName() {
        return "The  Jerk is a Hollywood Comedy Movie";
    }
}
