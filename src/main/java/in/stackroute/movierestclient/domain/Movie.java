package in.stackroute.movierestclient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private boolean adult;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("belongs_to_collection")
    private String belongsToCollection;

    private long budget;
    private Genre[] genres;

    @JsonProperty("homepage")
    private String homePage;
    private int id;

    @JsonProperty("imdb_id")
    private String imdbId;

    @JsonProperty("original_language")
    private String originalLanguage;

    @JsonProperty("original_title")
    private String originalTitle;
    private String overview;
    private double popularity;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("production_companies")
    private ProductionCompany[] productionCompanies;

    @JsonProperty("production_countries")
    private ProductionCountry[] productionCountries;

    @JsonProperty("release_date")
    private String releaseDate;
    private long revenue;
    private int runtime;

    @JsonProperty("spoken_languages")
    private SpokenLanguage[] spokenLanguages;
    private String status;
    private String tagline;
    private String title;
    private boolean video;

    @JsonProperty("vote_average")
    private double voteAverage;

    @JsonProperty("vote_count")
    private int voteCount;
}
