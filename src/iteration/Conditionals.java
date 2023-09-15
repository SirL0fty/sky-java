package iteration;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please provide your first number? ");
//        int firstNum = scanner.nextInt();
//
//        System.out.println("Please provide your second number? ");
//        int secondNum = scanner.nextInt();
//
//        if (firstNum > secondNum)
//            System.out.println(firstNum + " is the higher number");
//        else {
//            System.out.println(secondNum + " is the higher number");
//        }
//
//        System.out.println("Please provide another number? ");
//        int thirdNum = scanner.nextInt();
//        if (thirdNum % 2 == 0) {
//            System.out.println(thirdNum + " is even");
//        } else {
//            System.out.println(thirdNum + " is odd");
//            }
//
//
//        System.out.println("Please enter a traffic light colour,  Red, Amber or Green? ");
//        String lightColour = scanner.next();
//
//        if (lightColour.equals("Red")) {
//            System.out.println("STOP");
//        } else if (lightColour.equals("Amber")) {
//            System.out.println("SLOW DOWN");
//        } else if (lightColour.equals("Green")) {
//            System.out.println("GO GO GO");
//        } else {
//            System.out.println("You haven't selected an traffic light colour.");
//        }

        System.out.println("Please provide a number between 1-12? ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("This month is in Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This month is in Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This month is in Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This month is Autumn");
                break;
            default:
                System.out.println("This is not a valid month");

            scanner.close();

        }

    }

    }

