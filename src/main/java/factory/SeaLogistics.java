package factory;

import factory.domain.Ship;
import factory.domain.Transport;

public class SeaLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
