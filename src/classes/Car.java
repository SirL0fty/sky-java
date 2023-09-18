package classes;

public class Car {

    // Variables
    private String colour;
    private String reg;
    private String model;
    private String make;
    private int miles;
    private String ownerName;

    // Constructors
    public Car(String colour, String reg, String model, String make, int miles, String ownerName) {

        this.colour = colour;
        this.reg = reg;
        this.model = model;
        this.make = make;
        this.miles = miles;
        this.ownerName = ownerName;
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

    public String getOwnerName() {
        return ownerName;
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

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void showCarInfo() {
        System.out.println("Make:" + make);
        System.out.println("Model:" + model);
        System.out.println("Reg:" + reg);
        System.out.println("Miles:" + miles);
    }
    public void start() {
        System.out.println("\nThe car has started");
    }

    public void stop() {
        System.out.println("The car has reached it's destination");
    }

    public void driving() {
        System.out.println("The car is driving");
    }

    public int increaseMiles(int addedMiles) {
        this.miles = this.miles + addedMiles;
        return this.miles;
        }

    }