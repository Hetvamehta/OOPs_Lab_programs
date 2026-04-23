import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataFileAnalyzer {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        int lines = 0;
        int words = 0;
        int characters = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    words += trimmed.split("\\s+").length;
                }
                characters += line.replace(" ", "").length();
            }
            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + characters);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: data.txt");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
