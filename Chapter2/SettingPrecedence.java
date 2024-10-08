class SettingPrecedence {
  public static void main(String[] args) {
    //Default precedence 
        // 16 * 2 = 32, 32 -8 =24 ->  32+24 = 56  
        int sum = 32 - 8 + 16 *2;
        System.out.println("Default order: " + sum);
        
        
        //Addition and subtraction operations
        //now have precedence over
        //multiplication 
        // 24+16=40, 40*2 = 80 
        sum = (32 - 8 + 16) *2;
        System.out.println("Specified order: " + sum);
        
        //Nested parentheses 
        //The innermost brackets takes
        //precedence 
        // 32 - 24 = 8, *2 = 16 
        sum = (32-(8+16))*2;
        System.out.println("Nested Specific order: " + sum);
  }
}
