package designpatterns.structural.facade.subsystem;

public class Projector {

    public void on(){
        System.out.println("Projector On");
    }
    public void setInput(String input){
        System.out.println("Setting Projector Input to: " + input);
    }
    public void off(){
        System.out.println("Projector Off");
    }
}
