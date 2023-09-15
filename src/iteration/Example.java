package iteration;

public class Example {
    public static void main(String[] args) {


        // for loop
        for (int i = 0; i < 10; i++ ){
            System.out.println(i);
        }

        // while loop
        int sandwiches = 0;
        boolean notEnoughSandwiches = true;

        while  ( notEnoughSandwiches ) {
            System.out.println("add another sandwich");
            sandwiches++;

            if (sandwiches > 382) {
                notEnoughSandwiches = false;
            }
        }
        System.out.println("I have to many sandwiches");

        // do-while loop
        int cupsOfTea = 20;
        boolean notEnoughCupsOfTea = false;

        do {
            System.out.println("Get another cuppa!");
            cupsOfTea++;
            if (cupsOfTea >= 2) {
                notEnoughCupsOfTea = false;
            }
        } while (notEnoughCupsOfTea);

        System.out.println("We have enough tea!");

        // transfer and control statements

        for (int i = 0; i < 10; i++){
            if (i ==2) {
                continue;
            }

            if (i ==7) {
                break;
            }
            System.out.println(i);
        }
    }

}
