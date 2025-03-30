package designpatterns.prototype;

public class PrototypePatternExample {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Shape circle2 = circle1.clone();
        circle1.draw();
        circle2.draw();

        Rectangle rectangle1 = new Rectangle(5, 8);
        Shape rectangle2 = rectangle1.clone();
        rectangle1.draw();
        rectangle2.draw();
    }
}

