public class JavaMethodsInOneFileExample {
  
  public static void main(String[] args) {
    
    System.out.println("Hello from main!");


    //call myFunctionOne
    //no input, no return 
    myFunctionOne();   

    
    //call myFunctionTwo
    System.out.println(myFunctionTwo());  

    //no input - return int
    int result = myFunctionTwo();  
    System.out.println("Num vowels: "+result);

    
    //call myFunctionThree - input , no return 
    int x = 20;
    myFunctionThree(100);
    myFunctionThree(x);

    
    //call myFunctionFour - inputs , return 
    boolean issueTicket = myFunctionFour(130, 50);
    System.out.println("Issue ticket: "+issueTicket);
   
    
  } //end main 

  
  // Scenario 1: Function - No input/No return 
  public static void myFunctionOne() {
    System.out.println("Output Menu");
  } //end myFunctionOne


  
    // Scenario 2: Function -No input/Yes return 
  public static int myFunctionTwo() {
    //create a local variable
    int numVowels=0;
    //code to count vowels ..... 
    return numVowels;
  } //end myFunctionTwo


  
  //Scenario 3 - Input Yes/No Return
  public static void myFunctionThree(int num)
  {
    int num2 = 100;
    System.out.println(num+num2);
  } //end myFunctionThree


  
  //Scenario 4 - Yes Input, Yes Return
  public static boolean myFunctionFour(int speed, int speedLimit){
    boolean result = (speed>speedLimit) ? true : false ;  
    return result;
  } //end myFunctionFour

   
} //end class 
