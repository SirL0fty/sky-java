package iteration;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your first number? ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the type of operation you want to perform (+, -, *, /): ");
        String operator = scanner.next();

        System.out.println("Please provide your second number? ");
        int num2 = scanner.nextInt();

        int total = 0;

        switch (operator) {
            case "+":
                total = num1 + num2;
                System.out.println(total);
                break;
            case "-":
                total = num1 - num2;
                System.out.println(total);
                break;
            case "/":
                total = num1 / num2;
                System.out.println(total);
                break;
            case "*":
                total = num1 * num2;
                System.out.println(total);
                break;
            default:
                System.out.println("Please enter a valid operator(+, -, *, /):" );
        }

    }
}
