package in.stackroute.movierestclient.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Credit {

    private int id;
    private Cast[] cast;
    private Crew[] crew;

}
