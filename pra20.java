public class pra20 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide numerator and denominator as command-line arguments.");
            }
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            double result = (double) numerator / denominator;
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
