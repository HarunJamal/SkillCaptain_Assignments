import java.util.Scanner;

public class LargerOfTwo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a>b){
            System.out.println("The larger number is "+a);
        }
        else if (b>a){
            System.out.println("The larger number is "+b);
        }
        else{
            System.out.println("both are equal/invalid input");
        }

        input.close();

    }
}
