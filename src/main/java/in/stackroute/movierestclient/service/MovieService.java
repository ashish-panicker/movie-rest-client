package in.stackroute.movierestclient.service;

import in.stackroute.movierestclient.domain.Credit;
import in.stackroute.movierestclient.domain.Movie;

public interface MovieService {
    
    Movie getMovieById(int id);

    Credit getCreditByMovieId(int id);
}
