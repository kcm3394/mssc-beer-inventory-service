package guru.sfg.brewery.model.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor //needed for Jackson to know how to construct
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 4437176071831827193L;

    private BeerDto beerDto;
}
