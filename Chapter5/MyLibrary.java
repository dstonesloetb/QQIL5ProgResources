public class MyLibrary {

    // Method 1: Say Hello
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 2: Add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method 3: Check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method 4: Find the largest of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method 5: Print an array
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 
