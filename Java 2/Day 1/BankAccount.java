import java.util.Scanner;

public class BankAccount{
    int accountNumber;
    String name;
    float balance;

    Scanner input = new Scanner(System.in);

    public BankAccount(int accountNumber, String name, float balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(){
        System.out.println("Your Account number is "+this.accountNumber);
        System.out.println("Enter the amount you want to deposit:");
        float depositAmt = input.nextFloat();

        this.balance = this.balance + depositAmt;
        System.out.println("your current balance is "+this.balance);
    }

    void withdraw(){
        System.out.println("Your Account number is "+this.accountNumber);
        System.out.println("Enter the amount you wish to withdraw:");
        float withdrawAmt = input.nextFloat();

        this.balance = this.balance - withdrawAmt;
        System.out.println("your current balance is "+this.balance);
    }

    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Account number: "+this.accountNumber);
        System.out.println("Balance: "+this.balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1234,"Rajesh",10000);
        BankAccount acc2 = new BankAccount(1236,"Ahmed",10500);

        acc1.deposit();
        acc1.withdraw();
        

        acc1.display();
        acc2.display();
    }
} 