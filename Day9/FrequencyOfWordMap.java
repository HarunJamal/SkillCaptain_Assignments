import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWordMap{
    
    public static void main(String[] args) {
        Map <String, Integer> WordCounter = new HashMap<>();
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the paragraph:");
        String para = input.nextLine();
        System.out.println("nice paragraph");

        input.close();
        
        String[] words = para.split("[,.\\s]+");
        for (String word : words){
            word = word.toLowerCase();   // converting all to lowercase because same word starting with capital letter will be counted as a different word otherwise
            if (WordCounter.containsKey(word)){
                int curval = WordCounter.get(word);
                WordCounter.put(word, curval + 1);
            }
            else{
                WordCounter.put(word, 1);
            }
        }

        System.out.println("Here is the list of words and their occurences:");
        System.out.println("=================================================");
        System.out.println("Word\t\tOccurence");
        System.out.println("------------------------------------");
        for (Map.Entry<String, Integer> entry : WordCounter.entrySet()) {
            System.out.println(entry.getKey() + "\t\t " + entry.getValue());
        }

    }
}