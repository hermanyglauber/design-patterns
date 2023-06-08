package abstractfactory.movies;

import model.movie.BollywoodActionMovie;
import model.movie.HollywoodActionMovie;

public class ActionMovieFactory extends AbstractMovieFactory {

    @Override
    public BollywoodActionMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }

    @Override
    public HollywoodActionMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }
}
