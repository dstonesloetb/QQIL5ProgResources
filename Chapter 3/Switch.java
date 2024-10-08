package com.mycompany.chapter3;

public class Switch {

    public static void main(String[] args) {
        // Declare and initialise 3 variables
        int month=2, year=2024, num = 0;

        //test the value assigned to the
        //month variable
        switch (month)
        {
            // Months - April, June, Sept, Nov
            case 4: case 6: case 9: case 11: 
                num = 30; 
                break;
            // Months - Jan, Mar, May, July, Oct, Dec
            case 1: case 3: case 5: case 7: case 8: case 10:
            case 12:
                num = 31; 
                break; 
            case 2: 
                //Feb leap year 29 days
                if (year%4 ==0)
                {
                    num = 29;
                }
                else 
                {
                    num = 28; 
                }
            default :
                num = -1; //error 
        } //end switch 
        
        System.out.println(month+"/"+year+":"+num+"days");
        //System.out.println(num);
        
    } //end main 
    
} //end class