package designpatterns.structural.decorator.concretedecorator;

import designpatterns.structural.decorator.component.Pizza;
import designpatterns.structural.decorator.decorator.ToppingDecorator;

public class Cheese extends ToppingDecorator {

    public Cheese(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Cheese";
    }

    @Override
    public double getCost(){
        return super.getCost() + 1.5;
    }
}
