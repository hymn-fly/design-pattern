package abstract_factory;

import abstract_factory.factories.FurnitureFactory;
import abstract_factory.factories.ModernFurnitureFactory;
import abstract_factory.factories.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        modernFactory.createChair().sitOn();
        victorianFactory.createChair().sitOn();
    }
}
