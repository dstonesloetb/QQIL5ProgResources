public class SortingHat {
    public static void main(String[] args) {
        String trait = "wisdom"; // Change this to test different houses

        if (trait.equalsIgnoreCase("bravery")) {
            System.out.println("🧙‍♂️ Sorting Hat says: Gryffindor!");
        } else if (trait.equalsIgnoreCase("wisdom")) {
            System.out.println("🧙‍♂️ Sorting Hat says: Ravenclaw!");
        } else if (trait.equalsIgnoreCase("loyalty")) {
            System.out.println("🧙‍♂️ Sorting Hat says: Hufflepuff!");
        } else if (trait.equalsIgnoreCase("ambition")) {
            System.out.println("🧙‍♂️ Sorting Hat says: Slytherin!");
        } else {
            System.out.println("🧙‍♂️ Sorting Hat says: Squib (No House)");
        }
    }
}
