package classes;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Silver", "YR64 OGI", "Polo", "VW", 90000);
        Driver mike = new Driver(c1);

        mike.driveCar(0);

        System.out.println(c1.getMiles());

        // Show's car info
        System.out.println("My Car:");
        c1.showCarInfo();

        // Start the car
        c1.start();

        int destinationMiles = 50; // adds the amount of miles to the trip
        for (int i = 1; i<=destinationMiles; i++) {
            System.out.println("\nMiles " + i + ":");
            c1.accelerate();
            c1.increaseMiles(1);
        }

        c1.stop();

    }
}
