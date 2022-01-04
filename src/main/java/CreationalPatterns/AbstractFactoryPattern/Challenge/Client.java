package CreationalPatterns.AbstractFactoryPattern.Challenge;

import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.BollywoodMovieInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.HollywoodMovieInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.MovieFactoryInterface;

import java.util.Objects;

public class Client {


    public static void main(String[] args){

    MovieFactoryInterface actionMoviesFactory = FactoryProducer.getFactory("Action");

        System.out.println("\n\n********ACTION MOVIES******");

        HollywoodMovieInterface hollywoodActionMovie = Objects.requireNonNull(actionMoviesFactory).getHollywoodMovie();
        System.out.println(hollywoodActionMovie.getMovieName());

        BollywoodMovieInterface bollywoodActionMovie = actionMoviesFactory.getBollywoodMovie();
        System.out.println(bollywoodActionMovie.getMovieName());



        System.out.println("\n\n********ACTION MOVIES******");

        MovieFactoryInterface comedyMovieFactory = FactoryProducer.getFactory("Comedy");
        HollywoodMovieInterface hollywoodComedyMovie = Objects.requireNonNull(comedyMovieFactory).getHollywoodMovie();
        System.out.println(hollywoodComedyMovie.getMovieName());

        BollywoodMovieInterface bollywoodComedyMovie = comedyMovieFactory.getBollywoodMovie();
        System.out.println(bollywoodComedyMovie.getMovieName());

    }

}
