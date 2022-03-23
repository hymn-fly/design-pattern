package abstract_factory.domain;

public class VictorianChair implements Chair{
    @Override
    public void hasLegs() {

    }

    @Override
    public void sitOn() {
        System.out.println("vicotrian chair");

    }
}
