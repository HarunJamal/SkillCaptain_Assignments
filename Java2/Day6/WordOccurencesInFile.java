import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordOccurencesInFile {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String filePath = "raitha.txt"; // Check the file path
        System.out.print("Enter word to look for in the file: ");
        String word = input.nextLine().toLowerCase(); // Convert to lowercase
        int wordCount = countOccurrencesOfWord(filePath, word);
        System.out.println("The number of times the word appears in the file's text: " + wordCount);
    }

    static int countOccurrencesOfWord(String filePath, String word) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+|\\.");
                for (String a : words) {
                    if (a.toLowerCase().equals(word)) { // Convert to lowercase
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}