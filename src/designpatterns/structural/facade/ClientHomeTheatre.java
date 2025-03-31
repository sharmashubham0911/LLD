package designpatterns.structural.facade;

import designpatterns.structural.facade.facadeclass.HomeTheatre;
import designpatterns.structural.facade.subsystem.Amplifier;
import designpatterns.structural.facade.subsystem.DvdPlayer;
import designpatterns.structural.facade.subsystem.Projector;

public class ClientHomeTheatre {

    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();

        HomeTheatre homeTheatre = new HomeTheatre(dvdPlayer, amplifier, projector);
        homeTheatre.watchMovie("Sholey");
        System.out.println();
        homeTheatre.endMovie();
    }
}
