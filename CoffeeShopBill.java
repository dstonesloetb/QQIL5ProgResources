
package com.mycompany.chapter2;

import java.util.Scanner;

public class CoffeeShopBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        //Output program header
        System.out.println("COFFEE SHOP PROGRAM");
        System.out.println("-------------------");
        
        // 1. Gather inputs from the user
        System.out.print("Number of coffees: ");
        int coffeeCount = input.nextInt();

        System.out.print("Price per coffee: ");
        double coffeePrice = input.nextDouble();

        System.out.print("Number of muffins: ");
        int muffinCount = input.nextInt();

        System.out.print("Price per muffin: ");
        double muffinPrice = input.nextDouble();

        // 2. Perform the calculations
        double totalCoffeeCost = coffeeCount * coffeePrice;
        double totalMuffinCost = muffinCount * muffinPrice;
        double totalBill = totalCoffeeCost + totalMuffinCost;

        // 3. Display the final results formatted to 2 decimal places
        System.out.println("\n--- Final Bill ---");
        System.out.printf("Coffee cost: EUR %.2f%n", totalCoffeeCost);
        System.out.printf("Muffin cost: EUR %.2f%n", totalMuffinCost);
        System.out.printf("Total bill:  EUR %.2f%n", totalBill);

        input.close();
    }
}
