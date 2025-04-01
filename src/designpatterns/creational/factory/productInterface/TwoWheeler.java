package designpatterns.creational.factory.productInterface;

public class TwoWheeler implements Vehicle{
    @Override
    public void printVehicle() {
        System.out.println("This is Two Wheeler Vehicle");
    }
}
