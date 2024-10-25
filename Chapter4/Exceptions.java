class Exceptions {
  public static void main(String[] args) {
    // Write a try statement to output
    //a single integer
    try 
    {
      int num = Integer.parseInt(args[0]);
      System.out.println("You entered: "+num); 
    } //end try
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Integer argument required.");
    }
    catch (NumberFormatException e)
    {
      System.out.println("Argument is wrong format.");
    }
    finally {
      System.out.println("Program ends.");
    }
        
  } //end main
    
} //end class
