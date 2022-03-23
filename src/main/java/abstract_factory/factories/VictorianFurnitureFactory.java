package abstract_factory.factories;

import abstract_factory.domain.Chair;
import abstract_factory.domain.VictorianChair;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public void createCoffeeTable() {

    }

    @Override
    public void createSofa() {

    }
}
