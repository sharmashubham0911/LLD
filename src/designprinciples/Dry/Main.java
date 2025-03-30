package designprinciples.Dry;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        // Call the methods which will log the operations
        int sum = mathOperations.add(3, 5);
        System.out.println("Sum: " + sum);

        int product = mathOperations.multiply(4, 6);
        System.out.println("Product: " + product);
    }
}
