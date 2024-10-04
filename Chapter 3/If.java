package com.mycompany.chapter3;

public class If {

    public static void main(String[] args) {
       //Check if one number is 
       //greater than another number
       //evaluating the test condition
       //result will true or false 
       //If the result is true output 5 is > 1
       //If the result is false skip that line
       //of code and continue with the rest of the program
       if (5>1) System.out.println("5 is > 1");
       
       //Selection Statement 
       //Execute a block of code 
       //if the test condition is true
       if (2<4)
       {
           System.out.println("2 is less than 4");
           System.out.println("Test succeeded.");
       } //end if
      
       
       //Use a range of boolean and comparison operators
       //to form a complex expression
       //Evaluate the inner most brackets first 
       int num = 8;
       
       if (((num>5) && (num<10)) || (num==12))
       {
           System.out.println("Num is 6-9 inclusive, or 12");
       }
       

       
    } //end main 
} //end class 
