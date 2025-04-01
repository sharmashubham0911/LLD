package designpatterns.structural.facade.subsystem;

public class DvdPlayer {

    public void on(){
        System.out.println("Dvd Player On");
    }
    public void play(String movie){
        System.out.println("Playing Movie: " + movie);
    }
    public void off(){
        System.out.println("Dvd Player Off");
    }
}
