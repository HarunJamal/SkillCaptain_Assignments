import java.util.Scanner;

public class ArrayTest{
    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 characters for array: ");
        for (int i=0; i < 5; i++){
            a[i] = input.nextInt();
        }

        // find sum

        int sum = 0;
        for (int x : a){
            sum += x;
        }

        //now find the average

        float avg = (float)sum / 5;

        //min and max

        int min = a[0];
        int max = a[0];
        for (int x=0; x<5; x++){
            if (a[x] > max){
                max = a[x];
            }
            if(a[x] < min){
                min = a[x];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

    }
}
