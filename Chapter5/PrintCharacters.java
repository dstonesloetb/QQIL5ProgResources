package com.mycompany.chapter5;

public class PrintCharacters {

    public static void main(String[] args) {
     
        //Declare and initialise our String variable
        String str = "Hello World!";
        
        //Get the length of the string
        int lenStr = str.length();  //len=12
        System.out.println("Length of string: "+lenStr);
        
        //Index for the string goes from 0 to the len-1
        //index for the current string ranges from 0 to 11 ie. (12-1)
        
        //Get the first character in the string
        char firstChar = str.charAt(0);
        System.out.println("First character: "+firstChar);
        
        //Display all the characters in the string one by one
        //Show on the same line seperated by a space
        //Index for string is 0 to 11 inclusive   i.e. str.length-1 (12-1)
                    // i<str.length()
        for (int i=0; i<=str.length()-1; i++)
        {
            System.out.print(str.charAt(i)+" ");
        } //end for 
        
    } //end main 
    
} //end class
