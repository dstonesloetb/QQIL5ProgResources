package com.mycompany.chapter2;

public class Arithmetic {

    public static void main(String[] args) {
        // Increment Operator Example
        System.out.println("Increment Example");
        System.out.println("------------------");
        int result = 0;
        System.out.println("initial result: "+result);
        result++;   // 0 -> 1
        System.out.println("updated result: "+result);
        
        // Decrement Operator Example
        System.out.println("\nDecrement Example");
        System.out.println("------------------");
        result = 10;
        System.out.println("initial result: "+result);
        result--;   // 10 -> 9
        System.out.println("updated result: "+result);
        
        // Modulus Operator Example
        System.out.println("\nModulus Example");
        System.out.println("------------------");
        int num1 = 13;
        int num2 = 2;
        //Modulus operator returns the remainder
        //of a divison calculation
        int modResult = num1 % num2;  //13%2-> 1 
        System.out.println("13%2= "+modResult);
        
        // Division Operator Example
        System.out.println("\nDivision Example");
        System.out.println("------------------");
        int num3 = 19;
        int num4 = 4;

        int divResult = num3 / num4;  //19/4 = 4.75
         float divResult2 = (float) num3 / num4;  //19/4 = 4.75
        
        System.out.println("19/4= "+divResult);
        System.out.println("19/4= "+divResult2);
        
        
    } //end main
} //end class
