// The Digital Fortune Cookie (Random Array Selector)
// This example pairs an array with Java's Random class to build a fortune teller.

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        // An array loaded with possible outcomes
        String[] fortunes = {
            "A thrilling time is in your immediate future.",
            "Your Java code will compile on the very first try today.",
            "An unexpected error will lead to a brilliant breakthrough.",
            "Do not follow where the path may lead. Go instead where there is no path.",
            "You will soon discover a hidden shortcut in your favorite game."
        };

        // Pick a random index from 0 to the length of the array
        Random random = new Random();
        int randomIndex = random.nextInt(fortunes.length);

        // Crack open the cookie!
        System.out.println("🥠 Fortune Cookie says: " + fortunes[randomIndex]);
    }
}
