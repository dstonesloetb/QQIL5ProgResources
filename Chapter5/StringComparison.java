package com.mycompany.chapter5;

public class StringComparison {

    public static void main(String[] args) {
        // Declare two string objects
        String emp1 = "Fred Smith";
        String emp2 = "fred smith";
        
        //Check to see if the content
        //of both strings are the same
//        if (emp1.equals(emp2))
//        {
//            System.out.println("Both names are the same");
//        }
//        else
//        {
//            System.out.println("Both names are not the same");
//        }
        
        if (emp1.equalsIgnoreCase(emp2))
        {
            System.out.println("Both names are the same");
        }
        else
        {
            System.out.println("Both names are not the same");
        }
            
        
    } //end main 
    
} //end class
