package learning;

import java.util.Scanner;

public class Variable {
    public Variable() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String nameFirstName = scanner.nextLine();

        System.out.println("Please enter your last name: ");
        String nameLastName = scanner.nextLine();

        System.out.println("Hi " + nameFirstName + " " + nameLastName + ", Nice to meet you!");

        System.out.println("What is your favourite number? ");
        int favNum = scanner.nextInt();

        System.out.println("What age are you? ");
        int yourAge = scanner.nextInt();

        System.out.println("Your favourite number and age added together is : " + (favNum + yourAge));

        scanner.close();
    }
}
