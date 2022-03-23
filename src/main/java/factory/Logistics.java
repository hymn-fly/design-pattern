package factory;

import factory.domain.Transport;

public abstract class Logistics {
    public void planDelivery(){
        Transport t = createTransport();
        t.deliver();
    }

    abstract Transport createTransport();

}
