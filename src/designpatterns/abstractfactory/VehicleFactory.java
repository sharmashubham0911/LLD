package designpatterns.abstractfactory;


// Abstract Factory
public interface VehicleFactory {

    Vehicle createCar(String model);
    Vehicle createBike(String model);
}
