import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle13 extends Shape {
    double area() {
        return d1 * d2;
    }
}

public class pra13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        System.out.print("Enter triangle base: "); double tb = sc.nextDouble();
        System.out.print("Enter triangle height: "); double th = sc.nextDouble();
        t.getData(tb, th);
        System.out.println("Triangle Area: " + t.area());

        Rectangle13 r = new Rectangle13();
        System.out.print("Enter rectangle length: "); double rl = sc.nextDouble();
        System.out.print("Enter rectangle width: "); double rw = sc.nextDouble();
        r.getData(rl, rw);
        System.out.println("Rectangle Area: " + r.area());
        sc.close();
    }
}
