import java.util.LinkedList;

public class pra32 {
    static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101); rollNumbers.add(102); rollNumbers.add(103);
        System.out.println("Roll Numbers: " + rollNumbers);
        System.out.println("Search 102: " + searchElement(rollNumbers, 102));
        System.out.println("Search 999: " + searchElement(rollNumbers, 999));

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice"); names.add("Bob"); names.add("Charlie");
        System.out.println("Names: " + names);
        System.out.println("Search 'Bob': " + searchElement(names, "Bob"));
        System.out.println("Search 'Dave': " + searchElement(names, "Dave"));
    }
}
