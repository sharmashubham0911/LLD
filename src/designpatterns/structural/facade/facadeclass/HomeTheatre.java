package designpatterns.structural.facade.facadeclass;

import designpatterns.structural.facade.subsystem.Amplifier;
import designpatterns.structural.facade.subsystem.DvdPlayer;
import designpatterns.structural.facade.subsystem.Projector;

public class HomeTheatre {

    DvdPlayer dvdPlayer;
    Projector projector;
    Amplifier amplifier;

    public HomeTheatre(DvdPlayer dvdPlayer, Amplifier amplifier, Projector projector){

        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void watchMovie(String movie){

        System.out.println("Get ready to watch a movie");
        projector.on();
        projector.setInput("Dvd");
        amplifier.on();
        amplifier.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){

        System.out.println("Shutting Down HomeTheatre");
        amplifier.off();
        dvdPlayer.off();
        projector.off();
    }
}
