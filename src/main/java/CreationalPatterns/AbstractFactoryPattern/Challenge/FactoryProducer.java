package CreationalPatterns.AbstractFactoryPattern.Challenge;

import CreationalPatterns.AbstractFactoryPattern.Challenge.contracts.MovieFactoryInterface;
import CreationalPatterns.AbstractFactoryPattern.Challenge.factories.ActionMovieFactory;
import CreationalPatterns.AbstractFactoryPattern.Challenge.factories.ComedyMovieFactory;

public class FactoryProducer {

    public static MovieFactoryInterface getFactory(String type){
        if(type.equalsIgnoreCase("Comedy")){
            return new ComedyMovieFactory();
        }else if(type.equalsIgnoreCase("Action")) {
            return new ActionMovieFactory();
        }

        return null;
    }
}
