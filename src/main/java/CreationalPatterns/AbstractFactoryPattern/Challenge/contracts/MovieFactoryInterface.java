package CreationalPatterns.AbstractFactoryPattern.Challenge.contracts;

public interface MovieFactoryInterface {

    HollywoodMovieInterface getHollywoodMovie();
    BollywoodMovieInterface getBollywoodMovie();
}
