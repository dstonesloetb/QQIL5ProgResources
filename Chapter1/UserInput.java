package com.mycompany.chapter1;

import java.util.Scanner;


public class UserInput {

 
    public static void main(String[] args) {
        // Declare variables
        String name="";
        int age = 0;
        float salary =0.0f;
        boolean isCar = false;
        
        Scanner in = new Scanner(System.in);
        
        //Input info from user
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.println("Hello "+name);
        
        System.out.print("Enter age: ");
        age = in.nextInt();
        System.out.println("Your age is: "+age);
        
        System.out.print("Enter salary: ");
        salary = in.nextFloat();
        System.out.println("Your salary is: "+salary);
         
        System.out.print("Car true/false: ");
        isCar = in.nextBoolean();
        System.out.println("You have a car: "+isCar);
        
        
    } //end main
    
} //end class 
