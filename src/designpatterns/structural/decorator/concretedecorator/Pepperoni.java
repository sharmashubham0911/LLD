package designpatterns.structural.decorator.concretedecorator;

import designpatterns.structural.decorator.component.Pizza;
import designpatterns.structural.decorator.decorator.ToppingDecorator;

public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Pepperoni";
    }

    @Override
    public double getCost(){
        return super.getCost() + 2.0;
    }
}
