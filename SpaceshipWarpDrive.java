public class SpaceshipWarpDrive {
    public static void main(String[] args) {
        String alertLevel = "Red"; // Change to Green, Yellow, Red, or anything else

        switch (alertLevel) {
            case "Green":
                System.out.println("🟢 All systems normal. Cruise mode activated.");
                break;
            case "Yellow":
                System.out.println("🟡 Shields up! Potential space debris ahead.");
                break;
            case "Red":
                System.out.println("🔴 EVACUATE! Warp core meltdown imminent!");
                break;
            default:
                System.out.println("🛸 Unknown alert status. Contact Starfleet command.");
                break;
        }
    }
}
