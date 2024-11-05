/* Demo methods in the String class such as isEmpty(), length(), charAr(), replace()
   Also using a custom method in a library to trim() a String 
*/

public class StringMethodExamples {


    public static void main(String[] args) {
       
        //Declare and initialise an empty
        //String variable
        String txt ="";
        
        //Check if the string is empty
        //and if it is empty then populate string
        if (txt.isEmpty()) txt = "    Borrocudo   ";
        
        //Output the string and its length
        System.out.println("String: "+txt);
        System.out.println("Original String length "
                + ""+txt.length());
        
        //Remove the leading and trailing spaces
        //output the string value and its size again
        
       txt =  MyStringOpsExample.displayTrimmedString(txt);
        
     
        //Output the first character in the string
        char initial = txt.charAt(0); 
        System.out.println("First letter: "+initial);

        
        //Output the last character in the string
        char last = txt.charAt(txt.length()-1); 
        System.out.println("Last letter: "+ last);

        
        //Replace all occurances of the letter 'o' 
        //with the letter 'a'
        txt = txt.replace('o', 'a');
        System.out.println("String: "+txt);
        
    } //end main 
    
} //end class
