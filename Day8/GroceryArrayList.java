import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryArrayList {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Grocery list");
        System.out.println("-------------");
        do{
        System.out.println("Choose from the following operations:\n1. add item\n2. remove an item\n3. Print Grocery list\n4. Item Check\n5. Clear grocery list \n6. Terminate");
        int x = input.nextInt();

        switch (x) {
            case 1:
            System.out.println("Enter item to add:");
            String thenga = input.nextLine();
            groceries.add(thenga);
                break;

            case 2:
            System.out.println("Enter item to remove:");
            String manga = input.nextLine();
            for (String chakka : groceries){
                if (chakka == manga){
                    groceries.remove(chakka);
                }
            }
                break;

            case 3:
            {
                System.out.println("Current items in grocery list:");
                for (String a : groceries){
                    System.out.println(a);
                }
            }
                break;

            case 4:
            System.out.println("Enter item to see if its there or not:");
            String baingan = input.nextLine();
            System.out.println(groceries.contains(baingan));
                break;

            case 5:
                System.out.println("Clearing entire list....");
                groceries.clear();
                break;
        
            default:
            System.out.println("Invalid operation");
                break;
            }  
        }
        while (op == 'Y');
        
    }
}
