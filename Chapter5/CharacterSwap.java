package com.mycompany.chapter5;

public class CharacterSwap {

    public static void main(String[] args) {
        
        //Declare and initialise an empty string variable
        String txt="";
        
        //Assign some characters to the string variable
        //if it is empty, with both leading and trailing
        //white spaces
        if (txt.isEmpty()) txt = "   Borrocudo   ";
        
        //Output the string value and
        //the length of the string
        System.out.println("String: "+txt);
        System.out.println("Len orig. string: "+txt.length());
        
        //Remove the leading/trailing white spaces
        txt = txt.trim();
        System.out.println("String: "+txt);
        System.out.println("Len updated string: "+txt.length());
        
        //Output the first character 
        char initial = txt.charAt(0);
        System.out.println("First letter: "+initial);
        
        //Output the last character 
        char last = txt.charAt(txt.length()-1);
        System.out.println("Last letter: "+last);
        
        //Replace all occurrences of the letter 'o'
        //with the character 'a'
        txt = txt.replace('o', 'a');
        System.out.println("String: "+txt);
        
    } //end main 
    
} //end class 
