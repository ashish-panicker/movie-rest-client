package in.stackroute.movierestclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.stackroute.movierestclient.domain.Credit;
import in.stackroute.movierestclient.domain.Movie;
import in.stackroute.movierestclient.service.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        Movie movie = movieService.getMovieById(id);
        return ResponseEntity.ok(movie);
    }

    @GetMapping("/{id}/credits")
    public ResponseEntity<Credit> getCreditByMovieId(@PathVariable int id) {
        Credit credit = movieService.getCreditByMovieId(id);
        return ResponseEntity.ok(credit);
    }
    
}
