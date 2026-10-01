import java.util.Scanner;

public class GalaxyTrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int credits = 100;
        boolean running = true;

        System.out.println("🛸 Welcome to the Galaxy Trader Terminal! 🛸");

        // Loop runs as long as the running flag is true and credits are above 0
        while (running && credits > 0) {
            System.out.println("\nCurrent Balance: " + credits + " credits.");
            System.out.println("1. Buy Space Fuel (-20 credits)");
            System.out.println("2. Upgrade Lasers (-50 credits)");
            System.out.println("3. Scavenge Space Wreckage (+40 credits)");
            System.out.println("4. Quit Game");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // If-else used inside switch to check budget
                    if (credits >= 20) {
                        credits -= 20;
                        System.out.println("🚀 Fuel tank full! Ready for warp speed.");
                    } else {
                        System.out.println("❌ Not enough credits for fuel!");
                    }
                    break;
                case 2:
                    if (credits >= 50) {
                        credits -= 50;
                        System.out.println("⚡ Lasers upgraded! Cosmic damage increased.");
                    } else {
                        System.out.println("❌ Not enough credits for weapon upgrades!");
                    }
                    break;
                case 3:
                    credits += 40;
                    System.out.println("💎 Found valuable scrap! Sold it to the nearest outpost.");
                    break;
                case 4:
                    System.out.println("👋 Docking spaceship. Goodbye, Commander!");
                    running = false;
                    break;
                default:
                    System.out.println("⚠️ Invalid system command! Try again.");
                    break;
            }

            // Automatic game over condition check
            if (credits <= 0) {
                System.out.println("\n💀 Bankrupt! Your ship was impounded by space pirates.");
            }
        }
        scanner.close();
    }
}
