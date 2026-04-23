import java.util.LinkedList;

public class GenericLinkedListSearch {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        LinkedList<String> names = new LinkedList<>();
        names.add("Aarav");
        names.add("Diya");
        names.add("Kunal");

        System.out.println("Hetva-25");
        System.out.println("Search 102 in roll numbers: " + searchElement(rollNumbers, 102));
        System.out.println("Search 110 in roll numbers: " + searchElement(rollNumbers, 110));
        System.out.println("Search Diya in names: " + searchElement(names, "Diya"));
        System.out.println("Search Riya in names: " + searchElement(names, "Riya"));
    }
}
