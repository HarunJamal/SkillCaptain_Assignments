import java.util.Scanner;

abstract class Vehicle{
    String make;
    String model;
    int year;

    Scanner input = new Scanner(System.in);

    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails(){
        System.out.println("Vehicle Details\n-------------------");
        System.out.println("make: "+this.make);
        System.out.println("model: "+this.model);
        System.out.println("make: "+this.year);
    }
}

class Car extends Vehicle{
    int numDoors;
    String fuelType;

    Car(String make, String model, int year, int numDoors, String fuelType){
        super(make, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Doors: "+this.numDoors);
        System.out.println("Type of fuel used by Car: "+ this.fuelType);
    }

    void calculateMileage(){
        System.out.println("Mileage calculation\n----------------------");
        System.out.println("Using details of current trip....\n");
        System.out.print("Enter distance travelled(in km): ");
        float distanceTravelled = input.nextFloat();
        System.out.print("Enter fuel consumed (in L): ");
        float fuelConsumed = input.nextFloat();
        System.out.println("Mileage of vehicle: "+ (distanceTravelled/fuelConsumed));
    }

}

class Motorcycle extends Vehicle{
    boolean hasSidecar;
    int engineCapacity;

    Motorcycle(String make, String model, int year, boolean hasSidecar, int engineCapacity){
        super(make, model, year);
        this.hasSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("The bike has a sidecar?:"+hasSidecar);
        System.out.println("Engine Capacity(in cc): "+engineCapacity);
    }

    void calculateSpeed(){
        System.out.println("Speed calculation\n----------------------");
        System.out.println("Using details of current trip....\n");
        System.out.print("Enter distance travelled(in km): ");
        float distanceTravelled = input.nextFloat();
        System.out.print("Enter time taken to cover said distance (in hrs): ");
        float totalTriptime = input.nextFloat();
        System.out.println("Average speed of vehicle: "+ (distanceTravelled/totalTriptime));
    }
}

public class VehicleInventory{
    public static void main(String[] args) {

    }
}