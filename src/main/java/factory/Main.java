package factory;

import factory.domain.Ship;
import factory.domain.Transport;
import factory.domain.Truck;
import factory.logistics.LogisticType;

public class Main {
    public static void main(String[] args) {
        doDeliveryBy(LogisticType.Road);
        doDeliveryBy(LogisticType.Sea);
    }

    private static void doDeliveryBy(LogisticType logisticType){
        if (logisticType == LogisticType.Road){
            new RoadLogistics().planDelivery();
        }
        else
            new SeaLogistics().planDelivery();

    }
}
