import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordLineCharacterCounter {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        if (args.length != 1) {
            System.out.println("Usage: java FileWordLineCharacterCounter <file-name>");
            return;
        }
        int lines = 0;
        int words = 0;
        int characters = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    words += trimmed.split("\\s+").length;
                }
            }
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
