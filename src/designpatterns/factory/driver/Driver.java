package designpatterns.factory.driver;

import designpatterns.factory.Client.Client;
import designpatterns.factory.factoryInterface.FourWheelerFactory;
import designpatterns.factory.factoryInterface.TwoWheelerFactory;
import designpatterns.factory.factoryInterface.VehicleFactory;
import designpatterns.factory.productInterface.Vehicle;

public class Driver {

    public static void main(String[] args) {

        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();

    }
}
