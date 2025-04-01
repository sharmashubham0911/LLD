package designpatterns.creational.factory.driver;

import designpatterns.creational.factory.Client.Client;
import designpatterns.creational.factory.factoryInterface.FourWheelerFactory;
import designpatterns.creational.factory.factoryInterface.TwoWheelerFactory;
import designpatterns.creational.factory.factoryInterface.VehicleFactory;
import designpatterns.creational.factory.productInterface.Vehicle;

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
