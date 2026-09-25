package com.mycompany.chapter2;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("PIZZA PARTY PROGRAM");
        System.out.println("-------------------");


        // 1. Gather inputs from the user
        System.out.print("Students: ");
        int students = input.nextInt();

        System.out.print("Pizzas: ");
        int pizzas = input.nextInt();

        System.out.print("Slices per pizza: ");
        int slicesPerPizza = input.nextInt();

        // 2. Perform math operations
        int totalSlices = pizzas * slicesPerPizza;
        int slicesEach = totalSlices / students;     // Integer division drops the decimal
        int slicesLeftOver = totalSlices % students; // Modulus calculates the remainder

        // 3. Display the final results
        System.out.println();
        System.out.println("Total slices: " + totalSlices);
        System.out.println("Slices each: " + slicesEach);
        System.out.println("Slices left over: " + slicesLeftOver);

        input.close();
    }
}
