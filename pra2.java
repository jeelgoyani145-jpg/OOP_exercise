import java.util.Scanner;

public class pra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: "); double a = sc.nextDouble();
        System.out.print("Enter b: "); double b = sc.nextDouble();
        System.out.print("Enter c: "); double c = sc.nextDouble();
        System.out.print("Enter d: "); double d = sc.nextDouble();
        System.out.print("Enter e: "); double e = sc.nextDouble();
        System.out.print("Enter f: "); double f = sc.nextDouble();
        double D = a * d - b * c;
        if (D == 0) {
            System.out.println("No unique solution (denominator is zero).");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - e * c;
            System.out.printf("x = %.4f%n", Dx / D);
            System.out.printf("y = %.4f%n", Dy / D);
        }
    }
}
