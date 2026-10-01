public class HauntedRollercoaster {
    public static void main(String[] args) {
        int age = 13;
        double heightInCm = 145.5; // Change these values to test

        // Both conditions must be true using the AND (&&) operator
        if (age >= 12 && heightInCm >= 140.0) {
            System.out.println("🎢 Welcome aboard, thrill-seeker!");
        } else {
            System.out.println("🛑 Sorry, you do not meet the safety requirements.");
        }
    }
}
