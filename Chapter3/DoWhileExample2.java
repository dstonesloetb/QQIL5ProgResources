public class DoWhileExample2 {

 
    public static void main(String[] args) {
        //Declare and initialise an integer
        //variable called num
        int num = 100;
        
        //Display the num variable's
        //current value while its below 10 
        do
        {
            System.out.println("Do While Countup: "+num);
            num += 10; //num=num+10 
        } 
        while (num < 10);
        
        
    } //end main 
    
} //end class
