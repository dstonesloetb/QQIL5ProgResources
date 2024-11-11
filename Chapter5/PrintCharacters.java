package com.mycompany.chapter5;

public class PrintCharacters {

    public static void main(String[] args) {
     
        //Declare and initialise our String variable
        String str = "Hello World!";
        
        //Get the length of the string
        int lenStr = str.length();
        System.out.println("Length of string: "+lenStr);
        
        //Get the first character in the string
        char firstChar = str.charAt(0);
        System.out.println("First character: "+firstChar);
        
        //Display all the characters in the string one by one
        //Show on the same line seperated by a space
        //Index for string is 0 to 14 inclusive   i.e. str.length-1 (15-1)
                    // i<str.length()
        for (int i=0; i<=str.length()-1; i++)
        {
            System.out.print(str.charAt(i)+" ");
        } //end for 
        
    } //end main 
    
} //end class
