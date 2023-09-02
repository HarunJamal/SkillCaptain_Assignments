import java.util.Scanner;

public class RangeInputDowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a number between 1 and 20: ");
            int n = input.nextInt();
            if (n>=1 && n<=20){
                System.out.println("You entered " + n +".");
                input.close();
                return;
            }
        } while (true);
    }
}
