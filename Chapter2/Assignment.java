package com.mycompany.chapter2;

public class Assignment {


    public static void main(String[] args) {
        // Assignment and Equality Operators 
        
        //Addition and Assignment Operator +=
        int a = 10;
        int b = 20;
        // a = a + b;
        a += b;  // 30 = 10+20 
        System.out.println("Result 1: "+a);
        
        //Equality Operator == 
        //Checking for equality (comparison) 
        // Does a equal to b 
        // result will be true or false 
        System.out.println("Is A equal to B: "+ (a==b));
        
        //Assignment Operator = 
        // Assigning the value of one variable
        //to another variable
        //Assigning the value of variable b to
        //variable a 
        // a = 10,  b =20 (initial values)
        a = b;  //a = 20 
        System.out.println("a's new value: "+ a);
        
        
    } //end main
} //end class 
