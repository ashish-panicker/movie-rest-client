package in.stackroute.movierestclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import in.stackroute.movierestclient.domain.Credit;
import in.stackroute.movierestclient.domain.Movie;

@Service
public class MovieServiceImpl implements MovieService {

    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    public MovieServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Movie getMovieById(int id) {
        return restTemplate.getForObject("https://api.themoviedb.org/3/movie/{id}?api_key={apiKey}", Movie.class, id, apiKey);
    }

    @Override
    public Credit getCreditByMovieId(int id) {
        return restTemplate.getForObject("https://api.themoviedb.org/3/movie/{id}/credits?api_key={apiKey}", Credit.class, id, apiKey);
    }

}
