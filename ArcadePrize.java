public class ArcadePrize {
    public static void main(String[] args) {
        char prizeTier = 'B'; // Change to 'A', 'B', 'C', or 'D'

        switch (prizeTier) {
            case 'A':
                System.out.println("🧸 Tier A (Giant Plushie) costs 500 tickets.");
                break;
            case 'B':
                System.out.println("🔫 Tier B (Laser Tag Gun) costs 250 tickets.");
                break;
            case 'C':
                System.out.println("🕶️ Tier C (Neon Sunglasses) costs 50 tickets.");
                break;
            default:
                System.out.println("❌ Invalid tier. Please choose A, B, or C.");
                break;
        }
    }
}
