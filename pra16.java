interface Classify {
    String getDivision(double average);
}

class Result16 implements Classify {
    public String getDivision(double average) {
        if (average >= 60) return "First Division";
        else if (average >= 45) return "Second Division";
        else if (average >= 33) return "Third Division";
        else return "Fail";
    }
}

public class pra16 {
    public static void main(String[] args) {
        Result16 r = new Result16();
        System.out.println("Average 75: " + r.getDivision(75));
        System.out.println("Average 50: " + r.getDivision(50));
        System.out.println("Average 30: " + r.getDivision(30));
    }
}
