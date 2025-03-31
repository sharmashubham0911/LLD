package designpatterns.structural.decorator.concretecomponent;

import designpatterns.structural.decorator.component.Pizza;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
