import java.util.Scanner;

public class HackerTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretPasscode = 1337;
        int attempts = 0;
        boolean accessGranted = false;

        System.out.println("💻 INFRASTRUCTURE MAINFRAME v4.26 💻");
        System.out.println("WARNING: 3 unauthorized attempts will trigger immediate lockdown.\n");

        // Do-while guarantees this block executes at least once
        do {
            System.out.print("ENTER 4-DIGIT PASSCODE: ");
            int guess = scanner.nextInt();
            attempts++;

            // If-else structure evaluates credentials and attempts left
            if (guess == secretPasscode) {
                System.out.println("\n🔓 Access Granted. Downloading classified data... 🖥️");
                accessGranted = true; 
            } else {
                if (attempts == 3) {
                    System.out.println("\n🚨 SYSTEM LOCKDOWN. Security drones dispatched! 🚨");
                } else {
                    System.out.println("❌ Access Denied. Attempts remaining: " + (3 - attempts));
                }
            }

        // Loop continues until access is granted OR they hit 3 attempts
        } while (!accessGranted && attempts < 3);

        scanner.close();
    }
}
