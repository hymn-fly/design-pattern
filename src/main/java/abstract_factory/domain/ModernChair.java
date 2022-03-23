package abstract_factory.domain;

public class ModernChair implements Chair{
    @Override
    public void hasLegs() {

    }

    @Override
    public void sitOn() {
        System.out.println("modern chair");

    }
}
