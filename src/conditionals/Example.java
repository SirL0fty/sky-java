package conditionals;

public class Example {
    public static void main(String[] args) {

        boolean isLightOn = true;

        if (isLightOn) {
            System.out.println("I can see!");
        } else {
            System.out.println("It's dark!");
        }

        // VARS
        Integer number = 10;

        // Is equal to
        if (number == 8) {
            System.out.println("number is 8");
        } else {
            System.out.println("number is not 8");
        }

        // if NOT equal to
        if(number != 10) {
            System.out.println("Number is not 10");
        } else {
            System.out.println("Number is 10");
        }

        // less than
        if (number < 20) {
            System.out.println("number is smaller than 20");
        }

        // greater than
        if (number > 3) {
            System.out.println("number is larger than 3");
        }

        // less than or equal to
        if (number <= 12) {
            System.out.println("number is less or equal to 12");
        }

        //  greater than or equal to
        if (number >= 9) {
            System.out.println("number is greater or equal to 9");
        }

        // greater and "&&" less
        if (number > 3 && number < 11) {
            System.out.println("number is greater than 3 and less than 11");
        }

        // number is equal "or || number is equal
        if (number == 1 ||  number == 10) {
            System.out.println("number is equal to 1 or 10");
        }

        // comparing types
        if ( number instanceof Integer) {
            System.out.println("number is an integer");
        }

        // IF / ELSE IF /ELSE
        if (number == 1) {
            System.out.println("We are number 1");
        } else if (number == 4) {
            System.out.println("four ain't bad");
        } else if (number == 10) {
            System.out.println("The number is 10");
        } else {
            System.out.println("here we are");
        }

        // SWITCH CASE
        int day;

        day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not a valid day");
                break;

        }


    }
}
