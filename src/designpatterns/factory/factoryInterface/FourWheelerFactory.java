package designpatterns.factory.factoryInterface;

import designpatterns.factory.productInterface.FourWheeler;
import designpatterns.factory.productInterface.Vehicle;

public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicleObject() {
        return new FourWheeler();
    }
}
