package com.mycompany.chapter2;

public class AssessingLogic {

    public static void main(String[] args) {
        // Declare and initialise variables
        boolean yes = true;
        boolean no = false;
        
        //Test if both conditions are true
                     //true&&true-> true
        boolean result = (yes&&yes);
        System.out.println("Yes&&Yes: "+result);
        
                    //true&&false-> false
        result = (yes && no);
        System.out.println("Yes&&No: "+result);
        
        //Test if either of the two conditions
        //is true 
                //true||true -> true 
        result = (yes || yes);
        System.out.println("Yes||Yes: "+result);
        
                //true||false -> true 
        result = (yes || no);
        System.out.println("Yes||No: "+result);
        
                //false||false -> false 
        result = (no || no);
        System.out.println("No||No: "+result);
        
        //To show the original and the inverse value
        result = yes; // result = true
        System.out.println("Result yes: "+result);
        
        //Logical NOT  
        //  !true -> false 
        result = !yes; 
        System.out.println("Result !yes: "+result);
                   
              
        
    } //end main
} //end class 
