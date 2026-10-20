// The Retro Game Map (2D Array)
// This example uses a 2-dimensional array to generate a
// tiny, top-down text adventure map.

public class RetroMap {
    public static void main(String[] args) {
        // A 4x4 grid representing a map: P = Player, T = Tree, X = Castle
        char[][] gameMap = {
            {'T', 'T', 'T', 'T'},
            {'T', 'P', ' ', 'T'},
            {'T', ' ', ' ', 'X'},
            {'T', 'T', 'T', 'T'}
        };

        System.out.println("--- Map Radar ---");
        // Nested loop to read rows and columns
        for (int row = 0; row < gameMap.length; row++) {
            for (int col = 0; col < gameMap[row].length; col++) {
                System.out.print(gameMap[row][col] + " ");
            }
            System.out.println(); // Jump to the next row
        }
    }
}
