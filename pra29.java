import java.util.*;

public class pra29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(92);
        marks.add(55);
        marks.add(88);
        marks.add(63);
        System.out.println("All Marks: " + marks);
        System.out.println("Highest Marks: " + Collections.max(marks));
        System.out.println("Lowest Marks: " + Collections.min(marks));
    }
}
