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
public class Crew extends Artist{
    
    private String department;
    private String job;

    @JsonProperty("credit_id")
    private String creditId;



}
