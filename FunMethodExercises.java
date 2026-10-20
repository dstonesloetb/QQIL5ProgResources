public class FunMethodExercises {

    public static void main(String[] args) {
        // --- Testing Exercise 1: Dragon Damage Calculator ---
        System.out.println("--- 🕹️ Dragon Damage Test ---");
        int heroHealth = 100;
        System.out.println("Hero starts with: " + heroHealth + " HP");
        
        // Sequential attacks (Bonus Challenge)
        heroHealth = takeDragonDamage(heroHealth, "fire");
        System.out.println("After fire attack: " + heroHealth + " HP");
        
        heroHealth = takeDragonDamage(heroHealth, "ice");
        System.out.println("After ice attack: " + heroHealth + " HP");
        
        // Massive attack to test the 0 health boundary rule
        int finalHealth = takeDragonDamage(15, "fire");
        System.out.println("Overkill test (15 HP - fire): " + finalHealth + " HP\n");


        // --- Testing Exercise 2: Secret Agent Code Generator ---
        System.out.println("--- 🕵️ Secret Agent Test ---");
        String agent1 = "James Bond";
        String agent2 = "Ada Lovelace";
        
        System.out.println(agent1 + " -> Codename: " + generateCodename(agent1));
        System.out.println(agent2 + " -> Codename: " + generateCodename(agent2) + "\n");


        // --- Testing Exercise 3: Flexible Coffee Orderer ---
        System.out.println("--- ☕ Coffee Order Overloading Test ---");
        orderCoffee();
        orderCoffee(3);
        orderCoffee(2, "Oat");
    }

    // ==========================================
    // EXERCISE 1 SOLUTION: Dragon Damage
    // ==========================================
    public static int takeDragonDamage(int currentHealth, String dragonElement) {
        int damage;

        // Determine damage based on the lowercase element string to prevent case errors
        switch (dragonElement.toLowerCase()) {
            case "fire":
                damage = 30;
                break;
            case "ice":
                damage = 20;
                break;
            default:
                damage = 10;
                break;
        }

        int remainingHealth = currentHealth - damage;

        // Health floor logic: if health falls below 0, set it to 0
        if (remainingHealth < 0) {
            return 0;
        }
        
        return remainingHealth;
    }

    // ==========================================
    // EXERCISE 2 SOLUTION: Secret Agent
    // ==========================================
    public static String generateCodename(String fullName) {
        // Convert the entire string to uppercase first
        String upperName = fullName.toUpperCase();
        
        // Use regex replacement to swap all variations of vowels for 'X'
        String scrambled = upperName.replaceAll("[AEIOU]", "X");
        
        return scrambled;
    }

    // ==========================================
    // EXERCISE 3 SOLUTION: Flexible Coffee Orderer
    // ==========================================
    // Version 1: No arguments
    public static void orderCoffee() {
        System.out.println("Ordered a Standard Black Coffee.");
    }

    // Version 2: One argument (sugar)
    public static void orderCoffee(int sugarCubes) {
        System.out.println("Ordered a coffee with " + sugarCubes + " sugar cubes.");
    }

    // Version 3: Two arguments (sugar and milk)
    public static void orderCoffee(int sugarCubes, String milkType) {
        System.out.println("Ordered a coffee with " + sugarCubes + " sugar cubes and " + milkType + " milk.");
    }
}
