import java.util.Random;

public class BossRaid {
    public static void main(String[] args) {
        Random random = new Random();
        int dragonHp = 100;

        System.out.println("🏹 A wild Dragon appears! Your archers prepare 10 arrows. 🏹\n");

        // For loop handles exactly 10 iterations (rounds)
        for (int turn = 1; turn <= 10; turn++) {
            // Generates a random damage number between 5 and 15
            int damage = random.nextInt(11) + 5; 
            dragonHp -= damage;

            System.out.println("➔ Arrow #" + turn + " hits for " + damage + " damage!");

            // Cascade of if-else checks to evaluate health milestones
            if (dragonHp <= 0) {
                System.out.println("\n⚔️ The dragon has fallen! Victory is yours! 🏆");
                break; // Breaks the loop instantly, skipping remaining turns
            } else if (dragonHp <= 30) {
                System.out.println("🔥 The dragon is Enraged! It breathes fire! (Remaining HP: " + dragonHp + ")");
            } else {
                System.out.println("🦖 The dragon roars! (Remaining HP: " + dragonHp + ")");
            }
            
            System.out.println("----------------------------------------");
        }

        // Check if the loop ended but the dragon survived
        if (dragonHp > 0) {
            System.out.println("\n💨 You ran out of arrows! The dragon flew away with " + dragonHp + " HP remaining.");
        }
    }
}
