package designpatterns.structural.decorator.concretedecorator;

import designpatterns.structural.decorator.component.Pizza;
import designpatterns.structural.decorator.decorator.ToppingDecorator;

public class Mushroom extends ToppingDecorator {

    public Mushroom(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Mushroom";
    }

    @Override
    public double getCost(){
        return super.getCost() + 1.0;
    }
}
