package designpatterns.creational.abstractfactory;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String factoryType = sc.next();

        VehicleFactory factory;

        if (factoryType.equals("Toyota")){
            factory = new ToyotaFactory();
        }
        else {
            factory = new HyundaiFactory();
        }

        // create car and bike

        Vehicle car = factory.createCar("SUV");
        Vehicle bike = factory.createBike("Scooter");

        // get the info

        car.displayInfo();
        bike.displayInfo();

//         Outputs

//        Input - Toyota
//        Car: Toyota- SUV
//        Bike: Toyota- Scooter

//        Input - Hyundai
//        Car: Hyundai- SUV
//        Bike: Hyundai- Scooter

    }
}
