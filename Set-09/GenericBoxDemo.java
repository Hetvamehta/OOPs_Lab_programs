import java.util.ArrayList;

class Box<T> {
    private final ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}

public class GenericBoxDemo {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.addItem("Aarav");
        nameBox.addItem("Diya");
        nameBox.addItem("Kunal");

        Box<Integer> rollNumberBox = new Box<>();
        rollNumberBox.addItem(101);
        rollNumberBox.addItem(102);
        rollNumberBox.addItem(103);

        System.out.println("Hetva-25");
        System.out.println("Names: " + nameBox.getItems());
        System.out.println("Roll Numbers: " + rollNumberBox.getItems());
    }
}
