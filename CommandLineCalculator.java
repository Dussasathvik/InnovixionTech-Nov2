import java.util.Scanner;

public class CommandLineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("Select operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            // Get user choice
            System.out.print("Enter choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            // Get user input for operands
            System.out.print("Enter first operand: ");
            double operand1 = scanner.nextDouble();
            System.out.print("Enter second operand: ");
            double operand2 = scanner.nextDouble();

            // Perform the calculation based on user choice
            switch (choice) {
                case 1:
                    displayResult(operand1, "+", operand2, operand1 + operand2);
                    break;
                case 2:
                    displayResult(operand1, "-", operand2, operand1 - operand2);
                    break;
                case 3:
                    displayResult(operand1, "*", operand2, operand1 * operand2);
                    break;
                case 4:
                    // Check for division by zero
                    if (operand2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        displayResult(operand1, "/", operand2, operand1 / operand2);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }

    // Display the calculation result
    private static void displayResult(double operand1, String operator, double operand2, double result) {
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}
