package designprinciples.Dry;

class Logger {
    // Logs method execution details
    public static void log(String methodName, Object[] args, Object result) {

        System.out.println("Executing method: " + methodName);
        System.out.print("Arguments: ");
        for (Object arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
}
