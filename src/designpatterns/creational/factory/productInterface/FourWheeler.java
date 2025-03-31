package designpatterns.creational.factory.productInterface;

public class FourWheeler implements Vehicle{
    @Override
    public void printVehicle() {
        System.out.println("This is Four Wheeler Vehicle");
    }
}
