package designpatterns.creational.factory.Client;

import designpatterns.creational.factory.factoryInterface.VehicleFactory;
import designpatterns.creational.factory.productInterface.Vehicle;

public class Client {

    Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory){
        vehicle = vehicleFactory.getVehicleObject();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
