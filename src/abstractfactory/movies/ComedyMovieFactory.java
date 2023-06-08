package abstractfactory.movies;

import model.movie.*;

public class ComedyMovieFactory extends AbstractMovieFactory {

    @Override
    public BollywoodComedyMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }

    @Override
    public HollywoodComedyMovie getHollywoodMovie() {
            return new HollywoodComedyMovie();
    }
}
