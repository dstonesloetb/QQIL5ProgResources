package com.mycompany.chapter3;

public class For {
   
    public static void main(String[] args) {
        // For example w3schools
        //Output the numbers 0 to 10
        //in steps of 2 all on the one line
        //separated by a space
        //Expected output: 0 2 4 6 8 10 
        for (int i=0; i<=10; i=i+2)
        {
            System.out.print(i+" ");
        } //end for 
              
        System.out.println("\n");
        
        //Output 10 to 1 backwards
        //on the same line
        //separated with commas
        for (int i=10; i>=1; i--)
        {
            if (i>1)
            {
                //printing the loop counter
                //with a comma seperator 
                System.out.print(i+", ");
            }
            else
            {   //printing the number 1 
                //without the comma 
                System.out.print(i);
            }
        } //end for
        
        System.out.println("\n");
        
        //Example of a nested for loop
        //Chapter 3 Page 51
        //Count the total number of iterations
        int num=0;
        
        //Outer for loop - 3 iterations
        for (int i=1; i<4;i++)
        {
            //Output the current value of
            //the outer loop counter 
            System.out.println("Outer loop i= "+i);
            
            //Inner for loop
            for (int j=1; j<4; j++)
            {
                System.out.print("\tInner loop j= "+j);
                System.out.println("\t\tTotal num= "+(++num));
            } //end inner for loop 
            
                    
        } //end outer for loop
        
        
    } //end main 
    
} //end class 
