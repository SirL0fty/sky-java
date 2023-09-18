package classes;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Silver", "YR64 OGI", "Polo", "VW", 90000);
        Driver mike = new Driver(c1);

        mike.driveCar(1000);

        System.out.println(c1.getMiles());

        // Show's car info
        System.out.println("My Car:");
        c1.showCarInfo();

    }
}
