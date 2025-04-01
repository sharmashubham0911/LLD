package designprinciples.Dry;

public class MathOperations {

    // Add method with logging
    public int add(int a, int b) {
        int result = a + b;
        Logger.log("add", new Object[]{a, b}, result); // Log the method execution
        return result;
    }

    // Multiply method with logging
    public int multiply(int a, int b) {
        int result = a * b;
        Logger.log("multiply", new Object[]{a, b}, result); // Log the method execution
        return result;
    }
}

