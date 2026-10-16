package com.mycompany.chapter5;

public class PizzaCalculator {
   
    public static void main(String[] args) {
        // Is one 18 inch pizza actually
        // a better deal than two 12 inch 
        // pizzas 
        //PIZZA 1: One Large 18 inch pizza for 20 euros
        double diameter1 = 18.0;
        double price1 = 20.0; 
        
        //PIZZA 2:  Two medium 12 inch pizzas for 22 euros
        //total 
        double diameter2 = 12.0;
        int quantity2 = 2;
        double price2 = 22.0; 
        
        //Calculate areas using Math.PI 
        double area1 = 
                Math.PI * Math.pow(diameter1/2,2);
        double area2 = 
                Math.PI * Math.pow(diameter2/2,2) *quantity2;
    
        System.out.printf("One 18 inch pizza gives "
                + " you %.2f sq inches of food "
                + "at eur %.4f per sq inch. %n",area1, (price1/area1) );
        
        System.out.printf("Two 12 inch pizza gives "
        + " you %.2f sq inches of food "
        + "at eur %.4f per sq inch. %n",area2, (price2/area2) );
        
        
    } //end main 
    
} //end class
