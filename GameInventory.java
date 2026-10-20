//This example uses a fixed-size 1-dimensional array
//to manage items in a player's backpack.


public class GameInventory {
    public static void main(String[] args) {
        // Create an inventory array with 5 available slots
        String[] backpack = new String[5];

        // Picking up items
        backpack[0] = "Legendary Sword";
        backpack[1] = "Health Potion";
        backpack[2] = "Shield of Light";

        // Displaying your current gear
        System.out.println("--- Current Inventory ---");
        for (int i = 0; i < backpack.length; i++) {
            if (backpack[i] != null) {
                System.out.println("Slot " + i + ": " + backpack[i]);
            } else {
                System.out.println("Slot " + i + ": [Empty]");
            }
        }
    }
}
