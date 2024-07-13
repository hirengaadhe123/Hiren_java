import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation;

        do {
            System.out.println("Choose an operation: +, -, *, /");
            String operation = scanner.next();

            System.out.print("Enter first number: ");
            double num1 = getValidNumber(scanner);
            
            System.out.print("Enter second number: ");
            double num2 = getValidNumber(scanner);
            
            switch (operation) {
                case "+":
                    System.out.printf("Result: %.2f%n", add(num1, num2));
                    break;
                case "-":
                    System.out.printf("Result: %.2f%n", subtract(num1, num2));
                    break;
                case "*":
                    System.out.printf("Result: %.2f%n", multiply(num1, num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.printf("Result: %.2f%n", divide(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalculation = scanner.next();

        } while (continueCalculation.equalsIgnoreCase("yes"));

        scanner.close();
    }

    private static double getValidNumber(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numeric value: ");
            }
        }
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}
