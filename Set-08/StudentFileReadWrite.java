import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileReadWrite {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        BufferedWriter writer = null;
        BufferedReader reader = null;
        try {
            writer = new BufferedWriter(new FileWriter("students.txt"));
            writer.write("1,Hetva,89");
            writer.newLine();
            writer.write("2,Riya,92");
            writer.newLine();
            writer.write("3,Aryan,85");
            writer.newLine();
            writer.flush();

            reader = new BufferedReader(new FileReader("students.txt"));
            String line;
            System.out.println("Student Records:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing writer: " + e.getMessage());
            }
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
