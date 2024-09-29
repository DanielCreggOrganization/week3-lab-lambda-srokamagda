package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        StringOperation toUpperCase1 = new ToUpperCase();

        String result1 = toUpperCase1.apply("hello world");
        System.out.println("Result: " + result1);

        // Using a lambda expression
        StringOperation toUpperCase2 = s -> s.toUpperCase();

        String result2 = toUpperCase2.apply("hello lambda");
        System.out.println("Result: " + result2);

        // Create a Runnable using a lambda expression
        Runnable task = () -> System.out.println("Hello from the thread");

        // Start a new thread
        Thread thread = new Thread(task);
        thread.start();

        // Lambda expression to compute the square of a number
        Calculator square = x -> x * x;

        int number = 5;
        int result = square.calculate(number);
        System.out.println("Square of " + number + " is: " + result);

        // Lambda to trim whitespace
        Function<String, String> trim = s -> s.trim();

        // Lambda to replace spaces with hyphens
        Function<String, String> replaceSpaces = s -> s.replace(" ", "-");

        // Lambda to convert to lowercase
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        // Combine lambdas using andThen
        Function<String, String> combinedOperation = trim
                .andThen(replaceSpaces)
                .andThen(toLowerCase);

        // Test the combined operation
        String input = "   Java Lambda Expressions Lab   ";
        String result3 = combinedOperation.apply(input);
        System.out.println("Result: " + result3);
    }
}
