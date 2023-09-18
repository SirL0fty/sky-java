package classes;

public class Driver {

 private Car car;

 public  Driver (Car car) {
     this.car = car;
 }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void driveCar(int miles) {
        this.car.increaseMiles(miles);
    }

}
