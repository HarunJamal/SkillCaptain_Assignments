import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        
        System.out.println("Enter the operation:");
        char op = input.nextLine().charAt(0);
        
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter first number");
        int b = input.nextInt();
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        
            default:
                System.out.println("invalid operation");
                break;
        }
        System.out.println(a+" "+op+" "+b+" = "+ result);
    }
}
