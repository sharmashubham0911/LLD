package designpatterns.structural.decorator.client;

import designpatterns.structural.decorator.component.Pizza;
import designpatterns.structural.decorator.concretecomponent.PlainPizza;
import designpatterns.structural.decorator.concretedecorator.Cheese;
import designpatterns.structural.decorator.concretedecorator.Mushroom;
import designpatterns.structural.decorator.concretedecorator.Pepperoni;

public class Client {

    public static void main(String[] args) {

        Pizza plainPizza = new PlainPizza();

        System.out.println(plainPizza.getDescription() + " Cost: $" + plainPizza.getCost());

        // Order a Pizza with Cheese

        Pizza cheesePizza = new Cheese(plainPizza);

        System.out.println(cheesePizza.getDescription() + " Cost: $" + cheesePizza.getCost());

        // Order a Pizza with Cheese and Pepperoni
        Pizza cheesePepperoniPizza = new Pepperoni(cheesePizza);

        System.out.println(cheesePepperoniPizza.getDescription() + " Cost: $" + cheesePepperoniPizza.getCost());

        // Order a Pizza with Mushroom and Cheese

        Pizza mushroomCheesePizza = new Mushroom(cheesePizza);

        System.out.println(mushroomCheesePizza.getDescription() + " Cost: $" + mushroomCheesePizza.getCost());

        // Order a double cheese Pizza

        Pizza doubleCheesePizza = new Cheese(cheesePizza);

        System.out.println(doubleCheesePizza.getDescription() + " Cost: $" + doubleCheesePizza.getCost());

    }
}
