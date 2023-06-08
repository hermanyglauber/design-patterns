package abstractfactory.movies;

public class MoviesProducer {
    public static AbstractMovieFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("action")) {
            return new ActionMovieFactory();
        }
        if(choice.equalsIgnoreCase("comedy")) {
            return new ComedyMovieFactory();
        }
        return null;
    }
}
