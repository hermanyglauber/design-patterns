package abstractfactory.movies;

public class MoviesClient {
    public static void main(String args[]) {
        AbstractMovieFactory actionMovie = MoviesProducer.getFactory("action");
        AbstractMovieFactory comedyMovie = MoviesProducer.getFactory("comedy");

        System.out.println(actionMovie.getHollywoodMovie().getMovieName());
        System.out.println(comedyMovie.getHollywoodMovie().getMovieName());
        System.out.println(actionMovie.getBollywoodMovie().getMovieName());
        System.out.println(comedyMovie.getBollywoodMovie().getMovieName());
    }
}
