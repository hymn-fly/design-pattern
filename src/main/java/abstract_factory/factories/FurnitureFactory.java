package abstract_factory.factories;

import abstract_factory.domain.Chair;

public interface FurnitureFactory {
    Chair createChair();
    void createCoffeeTable();
    void createSofa();
}
