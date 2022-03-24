package abstract_factory;

import abstract_factory.factories.FurnitureFactory;
import abstract_factory.factories.ModernFurnitureFactory;
import abstract_factory.factories.VictorianFurnitureFactory;
import abstract_factory.factorytype.FactoryType;

public class Main {
    public static void main(String[] args) {
        makeChairAndSit(FactoryType.Modern);
        makeChairAndSit(FactoryType.Victorian);
    }

    public static void makeChairAndSit(FactoryType type){

        if(type == FactoryType.Modern){
            FurnitureFactory factory = new ModernFurnitureFactory();
            factory.createChair().sitOn();
        }
        else if(type == FactoryType.Victorian){
            FurnitureFactory factory = new VictorianFurnitureFactory();
            factory.createChair().sitOn();
        }
    }
}
