import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumberChecker {
    public static void main(String[] args) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter an integer (or any non-integer input to exit): ");
                int x = input.nextInt(); // Read an integer

                // Check if the number is already in the set (duplicate check)
                if (uniqueNumbers.contains(x)) {
                    System.out.println(x + " is a duplicate.");
                } else {
                    System.out.println(x + " is original.");
                    uniqueNumbers.add(x);
                }
            } catch (InputMismatchException e) {
                // Handle non-integer input gracefully
                System.out.println("Invalid input. Exiting the loop.");
                break; // Exit the loop
            }
        }

        input.close();
    }
}