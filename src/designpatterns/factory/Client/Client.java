package designpatterns.factory.Client;

import designpatterns.factory.factoryInterface.VehicleFactory;
import designpatterns.factory.productInterface.Vehicle;

public class Client {

    Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory){
        vehicle = vehicleFactory.getVehicleObject();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
