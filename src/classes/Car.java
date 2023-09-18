package classes;

public class Car {

    // Variables
    private String colour;
    private String reg;
    private String model;
    private String make;
    private int miles;

    // Constructors
    public Car(String colour, String reg, String model, String make, int miles) {

        this.colour = colour;
        this.reg = reg;
        this.model = model;
        this.make = make;
        this.miles = miles;
    }

    //Getters
    public String getColour() {
        return colour;
    }

    public String getReg() {
        return reg;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getMiles() {
        return miles;
    }

    //Setters
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void showCarInfo() {
        System.out.println("Make:" + make);
        System.out.println("Model:" + model);
        System.out.println("Reg:" + reg);
        System.out.println("Miles:" + miles);
    }
    public void start() {
        System.out.println("The car has started");
    }

    public void stop() {
        System.out.println("The car has reached it's destination");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }

    public int increaseMiles(int addedMiles) {
        this.miles = this.miles + addedMiles;
        return this.miles;
        }

    }