package designpatterns.factory.factoryInterface;

import designpatterns.factory.productInterface.TwoWheeler;
import designpatterns.factory.productInterface.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{


    @Override
    public Vehicle getVehicleObject() {
        return new TwoWheeler();
    }
}
