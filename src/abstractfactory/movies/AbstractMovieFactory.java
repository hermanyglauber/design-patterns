package abstractfactory.movies;

import model.movie.BollywoodMovie;
import model.movie.HollywoodMovie;

public abstract class AbstractMovieFactory {
    public abstract BollywoodMovie getBollywoodMovie();
    public abstract HollywoodMovie getHollywoodMovie();
}
