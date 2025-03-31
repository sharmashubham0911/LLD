package designpatterns.creational.abstractfactory;

// Concrete Product

public class Bike implements Vehicle{

    String model;
     public Bike(String model){
         this.model = model;
     }
    @Override
    public void displayInfo() {
        System.out.println("Bike: " + model);
    }
}
