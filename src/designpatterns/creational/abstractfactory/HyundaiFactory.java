package designpatterns.creational.abstractfactory;

public class HyundaiFactory implements VehicleFactory{
    @Override
    public Vehicle createCar(String model) {
        return new Car("Hyundai- " + model);
    }

    @Override
    public Vehicle createBike(String model) {
        return new Bike("Hyundai- " + model);
    }
}
