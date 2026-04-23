import java.util.ArrayList;
import java.util.Collections;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(92);
        marks.add(67);
        marks.add(88);
        marks.add(95);

        System.out.println("Hetva-25");
        System.out.println("All Marks: " + marks);
        System.out.println("Highest Mark: " + Collections.max(marks));
        System.out.println("Lowest Mark: " + Collections.min(marks));
    }
}
