package abstract_factory.factories;

import abstract_factory.domain.Chair;
import abstract_factory.domain.ModernChair;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public void createCoffeeTable() {

    }

    @Override
    public void createSofa() {

    }
}
