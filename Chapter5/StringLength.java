class StringLength {
  public static void main(String[] args) {
      
  //Declare and initialise two Strings
    String lang = "Java";
    String series = " in easy steps";
          
    //Add another String variable
    //and assign it the concatenated value
    //of the other two strings
    // lang + series (+ concatenation operator)
    String title = lang.concat(series);
        
    //Output the concatenated string within quote
    //marks, and display size of string
    System.out.print("\""+title+"\" has ");
    System.out.println(title.length() + " chars");
        
  } //end main 
    
} //end class
