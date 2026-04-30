interface Exam {
    boolean isPassed(int mark);
}

interface Classify17 {
    String getDivision(double average);
}

class Result17 implements Exam, Classify17 {
    public boolean isPassed(int mark) {
        return mark >= 33;
    }

    public String getDivision(double average) {
        if (average >= 60) return "First Division";
        else if (average >= 45) return "Second Division";
        else if (average >= 33) return "Third Division";
        else return "Fail";
    }
}

public class pra17 {
    public static void main(String[] args) {
        Result17 r = new Result17();
        int mark = 55;
        double average = 62.5;
        System.out.println("Mark: " + mark + " -> Passed: " + r.isPassed(mark));
        System.out.println("Average: " + average + " -> Division: " + r.getDivision(average));

        int mark2 = 20;
        double average2 = 25.0;
        System.out.println("Mark: " + mark2 + " -> Passed: " + r.isPassed(mark2));
        System.out.println("Average: " + average2 + " -> Division: " + r.getDivision(average2));
    }
}
