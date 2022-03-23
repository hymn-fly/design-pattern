package factory;


import factory.domain.Transport;
import factory.domain.Truck;

public class RoadLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
