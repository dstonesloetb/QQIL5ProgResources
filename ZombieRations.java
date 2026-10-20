import java.util.Arrays;

public class ZombieRations {
    public static void main(String[] args) {
        int[] rations = {45, 12, 98, 4, 67, 23, 81};

        // Task 1: Find the Crisis Sector (Lowest Rations)
        int lowestRations = rations[0];
        int crisisIndex = 0;

        for (int i = 1; i < rations.length; i++) {
            if (rations[i] < lowestRations) {
                lowestRations = rations[i];
                crisisIndex = i;
            }
        }
        System.out.println("🚨 Crisis Sector found at Index " + crisisIndex + " with only " + lowestRations + " rations left!");

        // Task 2: Bunker Audit (Total Rations)
        int totalRations = 0;
        for (int ration : rations) {
            totalRations += ration;
        }
        System.out.println("📊 Bunker Audit: " + totalRations + " total rations remaining.");

        // Task 3: Emergency Air Drop (+50 to every sector)
        for (int i = 0; i < rations.length; i++) {
            rations[i] += 50;
        }
        System.out.println("🛩️ Post-Air Drop Inventory: " + Arrays.toString(rations));
    }
}
