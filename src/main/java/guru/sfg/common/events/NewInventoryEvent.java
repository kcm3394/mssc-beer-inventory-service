package guru.sfg.common.events;

import lombok.NoArgsConstructor;

@NoArgsConstructor //needed for Jackson to know how to construct
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
