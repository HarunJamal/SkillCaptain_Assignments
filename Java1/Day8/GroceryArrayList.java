import java.util.ArrayList;
import java.util.Scanner;

public class GroceryArrayList {
    public static ArrayList<String> groceries = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Grocery list");
        System.out.println("-------------");
        while(true){
        System.out.println("Choose from the following operations:\n1. add item\n2. remove an item\n3. Print Grocery list\n4. Item Check\n5. Clear grocery list \n6. Terminate");
        int x = input.nextInt();
        input.nextLine();

        switch (x) {
            case 1:
            addItem(input);
                break;

            case 2:
            removeItem(input);
                break;

            case 3:
            printGrocerylist();
                break;

            case 4:
            checkItem(input);
                break;

            case 5:
            clearGrocery();
                break;
            
            case 6:
            System.out.println("grocery list terminated");
            System.exit(0);

            default:
            System.out.println("Invalid operation (press number between 1 - 6)");
            
            }
            
        }

    }

    private static void clearGrocery(){
         System.out.println("Clearing entire list....");
         groceries.clear();
    }
    
    private static void addItem(Scanner input){
        System.out.println("Enter item to add:");
        String thenga = input.nextLine();
        groceries.add(thenga);
    }

    private static void removeItem(Scanner input){
        System.out.println("Enter item to remove:");
            String manga = input.nextLine();
            for (String chakka : groceries){
                if (chakka == manga){
                    groceries.remove(chakka);
                }
        }
    }

    private static void printGrocerylist(){
        
        System.out.println("Current items in grocery list:");
        for (String a : groceries){
            System.out.println(a);
        }
    }

    private static void checkItem(Scanner input){
        System.out.println("Enter item to see if its there or not:");
            String baingan = input.nextLine();
            boolean dhaniya = groceries.contains(baingan);
            if (dhaniya){
                System.out.println(baingan+" is there in grocery list");
            }
            else{
                System.out.println(baingan+" is not there in grocery list");
            }
    }


}
