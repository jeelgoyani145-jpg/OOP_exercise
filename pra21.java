public class pra21 {
    static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
        System.out.println("Age " + age + ": Eligible to vote.");
    }

    public static void main(String[] args) {
        int[] testAges = {20, 15, 18, 10};
        for (int age : testAges) {
            try {
                checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception for age " + age + ": " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
        }
    }
}
