import java.util.ArrayList;
import java.util.Scanner;

abstract class Vehicle {
    int vehicleID;
    String make;
    String model;
    int year;

    Scanner input = new Scanner(System.in);

    Vehicle(int vehicleID, String make, String model, int year) {
        this.vehicleID = vehicleID;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    abstract void displayDetails();

    abstract void enterDetails();
}

class Car extends Vehicle {
    int numDoors;
    String fuelType;
    float mileage;

    Car(int vehicleID, String make, String model, int year, int numDoors, String fuelType, float mileage) {
        super(vehicleID, make, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
        this.mileage = calculateMileage();
    }

   @Override
    void enterDetails() {

        System.out.println("Enter number of doors: ");
        this.numDoors = input.nextInt();
        input.nextLine(); 

        System.out.println("Enter type of fuel: ");
        this.fuelType = input.nextLine();

        this.mileage = calculateMileage();
    }
  
    @Override
    void displayDetails() {
        System.out.println("Car Details\n-------------------");
        System.out.println("Vehicle ID: "+ this.vehicleID);
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Number of Doors: " + this.numDoors);
        System.out.println("Type of Fuel: " + this.fuelType);
        System.out.println("Mileage of vehicle: " + (this.mileage));
        System.out.println("\n\n");
    }

    float calculateMileage() {
        System.out.println("Mileage calculation\n----------------------");
        System.out.println("Using details of current trip....\n");
        System.out.print("Enter distance travelled (in km): ");
        float distanceTravelled = input.nextFloat();
        System.out.print("Enter fuel consumed (in L): ");
        float fuelConsumed = input.nextFloat();
        float mileage = distanceTravelled / fuelConsumed;
        System.out.println("Mileage of vehicle is " + mileage +" km/L");
        return mileage;
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;
    int engineCapacity;
    float avgspeed;

    Motorcycle(int vehicleID, String make, String model, int year, boolean hasSidecar, int engineCapacity, float avgspeed) {
        super(vehicleID, make, model, year);
        this.hasSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
        this.avgspeed = calculateSpeed();
    }

    @Override
    void enterDetails() { 

        System.out.println("Does the bike have a sidecar? (Enter true or false): ");
        this.hasSidecar = input.nextBoolean();
        System.out.println("Enter engine capacity (in cc): ");
        this.engineCapacity = input.nextInt();

        this.avgspeed = calculateSpeed();
    }

    @Override
    void displayDetails() {
        System.out.println("Motorcycle Details\n-------------------");
        System.out.println("Vehicle ID: "+this.vehicleID);
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("The bike has a sidecar?: " + hasSidecar);
        System.out.println("Engine Capacity (in cc): " + engineCapacity);
        System.out.println("Speed of Motorcycle: " + avgspeed + " km/h");
        System.out.println("\n\n");
    }

    float calculateSpeed() {
        System.out.println("Speed calculation\n----------------------");
        System.out.println("Using details of current trip....\n");
        System.out.print("Enter distance travelled (in km): ");
        float distanceTravelled = input.nextFloat();
        System.out.print("Enter time taken to cover said distance (in hrs): ");
        float totalTripTime = input.nextFloat();
        float avgspeed = distanceTravelled / totalTripTime;
        System.out.println("Average speed of vehicle: " + (avgspeed) + "km/h");
        return avgspeed;
    }
}

public class VehicleInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
        char c;

        do {
            System.out.println("\tVehicle Inventory System\n----------------------------------------------------------------------");
            System.out.println("Input a number beside an option to choose:");
            System.out.println("1) Car Details Entry");
            System.out.println("2) Motorcycle Details Entry");
            System.out.println("3) Display All Vehicle Details");
            System.out.println("4) Delete Specific Vehicle");
            System.out.println("5) Update Specific Vehicle Details");

            int choice = scanner.nextInt(); // Get user input, e.g., a menu choice

            switch (choice) {
                case 1:
                    System.out.println("Car Details Entry:\n-----------------------------------------");
                    System.out.println("Enter Vehicle ID(number): ");
                    int vehicleID = scanner.nextInt();
                    System.out.print("Enter make: ");
                    String make = scanner.next();
                    System.out.print("Enter model: ");
                    scanner.nextLine();
                    String model = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter number of doors: ");
                    int numDoors = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter type of fuel: ");
                    String fuelType = scanner.nextLine();
                    float mileage = 0.0f;
                    inventory.add(new Car(vehicleID, make, model, year, numDoors, fuelType, mileage));
                    break;

                case 2:
                    System.out.println("Motorcycle Details Entry:\n-------------------------------");
                    System.out.println("Enter Vehicle ID(number): ");
                    vehicleID = scanner.nextInt();
                    System.out.print("Enter make: ");
                    make = scanner.next();
                    scanner.nextLine();
                    System.out.print("Enter model: ");
                    model = scanner.nextLine();
                    System.out.print("Enter year: ");
                    year = scanner.nextInt();
                    System.out.print("Does the bike have a sidecar? (Enter true or false): ");
                    boolean hasSidecar = scanner.nextBoolean();
                    System.out.print("Enter engine capacity (in cc): ");
                    int engineCapacity = scanner.nextInt();
                    float avgspeed = 0.0f;
                    inventory.add(new Motorcycle(vehicleID, make, model, year, hasSidecar, engineCapacity, avgspeed));
                    break;

                case 3:
                    System.out.println("Displaying All Vehicle Details:\n----------------------------------------");
                    for (Vehicle vehicle : inventory) {
                        vehicle.displayDetails();
                    }
                    break;

                case 4:
                System.out.println("Enter Vehicle ID delete in inventory:");
                int VehicleID4Search = scanner.nextInt();
                for (Vehicle vehicle : inventory) {
                    if (vehicle.vehicleID == VehicleID4Search ) {
                        inventory.remove(vehicle);
                        System.out.println("vehicle has been removed");
                    }
                    else{
                        System.out.println("vehicle not found/ ID invalid");
                    }
                }
                    break;

                case 5:
                System.out.println("Enter Vehicle ID to update in inventory:");
                int VehicleID5Search = scanner.nextInt();

                for (Vehicle vehicle : inventory) {
                    if (vehicle.vehicleID == VehicleID5Search ) {
                        int index = inventory.indexOf(vehicle);
                        
                        if (vehicle instanceof Car){
                            System.out.println("Enter new make of car: ");
                            scanner.nextLine();
                            make = scanner.nextLine();
                            System.out.println("Enter new model of car: ");
                            model = scanner.nextLine();
                            System.out.println("Enter new year of car: ");
                            year = scanner.nextInt();
                            System.out.println("Enter new number of doors in car: ");
                            numDoors = scanner.nextInt();
                            System.out.println("Enter new fuel type of car: ");
                            scanner.nextLine();
                            fuelType = scanner.nextLine();
                            mileage = 0.0f;
                            Car newvehicle = new Car(VehicleID5Search, make, model, year, numDoors, fuelType, mileage);
                            inventory.set(index, newvehicle);
                        }
                        else if(vehicle instanceof Motorcycle){
                            System.out.println("Enter new make of motorcycle: ");
                            scanner.nextLine();
                            make = scanner.nextLine();
                            System.out.println("Enter new model of motorcycle: ");
                            model = scanner.nextLine();
                            System.out.println("Enter new year of motorcycle: ");
                            year = scanner.nextInt();
                            System.out.println("Enter if new motorbike has sidecar (true/false): ");
                            hasSidecar = scanner.nextBoolean();
                            System.out.println("Enter new Engine Capacity (in cc): ");
                            scanner.nextLine();
                            engineCapacity = scanner.nextInt();
                            avgspeed = 0.0f;
                            Motorcycle newvehicle = new Motorcycle(VehicleID5Search, make, model, year, hasSidecar, engineCapacity, avgspeed);
                            inventory.set(index, newvehicle);
                        }  
                    }
                
                    else{
                        System.out.println("vehicle not found/ ID invalid");
                    }
                }
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }

            System.out.print("Would you like to continue? (Y for yes, enter anything else to quit): ");
            c = scanner.next().charAt(0);
        } while (c == 'y' || c == 'Y');

        scanner.close();
    }

}
