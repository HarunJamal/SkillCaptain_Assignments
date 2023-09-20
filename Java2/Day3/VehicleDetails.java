package Java2.Day3;
import java.util.Scanner;

class Vehicle{
    String brand;
    String model;
    int year;
    Float rentalPrice;


    Vehicle(Scanner in){
        System.out.print("Enter the vehicle brand: ");
        this.brand = in.nextLine();
        in.nextLine();
        System.out.print("Enter vehicle model: ");
        this.model = in.nextLine();
        in.nextLine();
        System.out.print("Enter year vehicle was manufactured: ");
        this.year = in.nextInt();
        System.out.print("Enter vehicle rental price: ");
        this.rentalPrice = in.nextFloat();
    }

    void displayVehicleInfo(){
        System.out.println("Vehicle brand: "+brand);
        System.out.println("Vehicle model: "+model);
        System.out.println("Manufacturing Year: "+year);
        System.out.println("Rental Price (in dollars): "+rentalPrice);
    }
}

    class Car extends Vehicle{
        int numberOfSeats;

        Car(Scanner in){
            super(in);
            System.out.println("Enter number of seats in Car: ");
            numberOfSeats = in.nextInt();
        }
    }

    class Motorcycle extends Vehicle{
        float engineCapacity;

        Motorcycle(Scanner in){
            super(in);
            System.out.println("Enter Engine capacity(in cc): ");
            engineCapacity = in.nextFloat();
        }
    }



public class VehicleDetails extends Vehicle{
    VehicleDetails(Scanner in) {
        super(in);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bike info: ");
        Motorcycle mot1 = new Motorcycle(scanner);

        System.out.println("Car info: ");
        Car car1 = new Car(scanner);

        System.out.println("Car Details\n------------------");
        car1.displayVehicleInfo();
        System.out.println("\nBike Details\n------------------");
        mot1.displayVehicleInfo();

        scanner.close();

    }
}
