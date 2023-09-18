package iteration;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your first number? ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the type of operation you want to perform (+, -, *, /, ^, %): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Please provide your second number? ");
        double num2 = scanner.nextDouble();

        double total = 0;

        switch (operator) {
            case '+':
                total = num1 + num2;
                break;
            case '-':
                total = num1 - num2;
                break;
            case '/':
                if (num2 != 0) {
                    total = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case '*':
                total = num1 * num2;
                break;
            case '%':
                if (num2 != 0) {
                    total = num1 % num2;
                } else {
                    System.out.println("Modulo by zero is not allowed.");
                    return;
                }
                break;
            case '^':
                total = 1;
                for (int i = 0; i < num2; i++) {
                    total *= num1;
                }
                break;
            default:
                System.out.println("Please enter a valid operator (+, -, *, /, ^, %):");
                return;
        }

        System.out.println("Result: " + total);
    }
}
