package designpatterns.creational.factory.factoryInterface;

import designpatterns.creational.factory.productInterface.TwoWheeler;
import designpatterns.creational.factory.productInterface.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{


    @Override
    public Vehicle getVehicleObject() {
        return new TwoWheeler();
    }
}
