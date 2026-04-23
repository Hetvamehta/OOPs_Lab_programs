import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hetva-25");
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        HashMap<String, Integer> frequencyMap = new HashMap<>();
        if (!sentence.isEmpty()) {
            String[] words = sentence.split("\\s+");
            for (String word : words) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        scanner.close();
    }
}
