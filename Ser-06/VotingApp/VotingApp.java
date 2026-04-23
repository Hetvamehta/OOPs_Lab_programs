public class VotingApp {
    public static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
        System.out.println("Age " + age + ": Eligible to vote");
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        int[] testAges = {16, 18, 25};

        for (int age : testAges) {
            try {
                checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Age " + age + ": " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
        }
    }
}
