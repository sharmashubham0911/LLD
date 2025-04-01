package designpatterns.creational.singleton;

public class Singleton {

    private static final Singleton singleTonObj = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleTonObj;
    }

}
