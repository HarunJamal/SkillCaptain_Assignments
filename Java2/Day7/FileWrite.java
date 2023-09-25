import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        

        String fileName = "output.txt";
        System.out.println("Enter a sentence to write in file: ");
        String text = input.nextLine();
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}  
