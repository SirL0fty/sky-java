package classes;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Silver", "YR64 OGI", "Polo", "VW", 90000, "Mike");

        // Get Owner Details
        String ownerName = c1.getOwnerName();
        System.out.println("Car Owner: " + ownerName);

        // Get initial miles
        System.out.println("Initial Miles: " + c1.getMiles());

        // Show's car info
        System.out.println("\nCar Details: ");
        c1.showCarInfo();

        // Start the car
        c1.start();

        // Add the destination miles
        int destinationMiles = 1000; // adds the amount of miles to the trip
        for (int i = 1; i <= destinationMiles; i++) {
            c1.increaseMiles(1);
        }

        // Car is driving
        c1.driving();
        System.out.println("a total of " + destinationMiles);

        // Stop the car
        c1.stop();

        // Total Miles after drive
        System.out.println("You have driven a total of " + c1.getMiles() + " miles");

    }
}
