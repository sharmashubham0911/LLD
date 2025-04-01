package designpatterns.creational.factory.factoryInterface;

import designpatterns.creational.factory.productInterface.FourWheeler;
import designpatterns.creational.factory.productInterface.Vehicle;

public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicleObject() {
        return new FourWheeler();
    }
}
