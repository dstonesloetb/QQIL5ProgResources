public class UsingLibrary {
    public static void main(String[] args) {
        // Call method from MyLibrary
        MyLibrary.sayHello("Alice");

        int sum = MyLibrary.addNumbers(5, 7);
        System.out.println("Sum: " + sum);

        boolean checkEven = MyLibrary.isEven(10);
        System.out.println("Is 10 even? " + checkEven);

        int largest = MyLibrary.max(20, 35);
        System.out.println("Largest number: " + largest);

        int[] numbers = {1, 2, 3, 4, 5};
        MyLibrary.printArray(numbers);
    }
}
 
