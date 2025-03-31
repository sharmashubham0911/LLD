package designpatterns.structural.decorator.decorator;

import designpatterns.structural.decorator.component.Pizza;

public abstract class ToppingDecorator implements Pizza{

    protected Pizza decoratedPizza;


    public ToppingDecorator(Pizza decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost(){
        return decoratedPizza.getCost();
    }

}
