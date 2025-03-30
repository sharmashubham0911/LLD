package designpatterns.factory.factoryInterface;

import designpatterns.factory.productInterface.FourWheeler;
import designpatterns.factory.productInterface.Vehicle;

public interface VehicleFactory {

    Vehicle getVehicleObject();
}
