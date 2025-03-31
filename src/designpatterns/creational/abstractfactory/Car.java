package designpatterns.creational.abstractfactory;

public class Car implements Vehicle{

    private String model;

    public Car(String model){
        this.model = model;
    }
    @Override
    public void displayInfo() {

        System.out.println("Car: " + model);
    }
}
