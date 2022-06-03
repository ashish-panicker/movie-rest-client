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
public class Cast extends Artist {

    private String character;
    private int order;

    @JsonProperty("credit_id")
    private String creditId;
    
    @JsonProperty("cast_id")
    private int castId;
}
