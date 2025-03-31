package designpatterns.structural.facade.subsystem;

public class Amplifier {

    public void on(){
        System.out.println("Amplifier On");
    }
    public void setVolume(int volume){
        System.out.println("Setting Volume: " + volume);
    }
    public void off(){
        System.out.println("Amplifier Off");
    }
}
