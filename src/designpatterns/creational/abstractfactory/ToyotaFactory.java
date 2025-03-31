package designpatterns.creational.abstractfactory;

// Concrete Factories
public class ToyotaFactory implements VehicleFactory{

    @Override
    public Vehicle createCar(String model){
        return new Car("Toyota- " + model);
    }

    @Override
    public Vehicle createBike(String model) {
        return new Bike("Toyota- " + model);
    }
}
