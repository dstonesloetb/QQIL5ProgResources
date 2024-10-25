class ArrayExample {
  public static void main(String[] args) {
    //Declare and initialising a String array
    //with three elements
    String[] str = {"Much ","More"," Java"};
        
    //Declare an empty integer array with 
    //three elements
    int[] num = new int[3];
        
    //Populate the list
    num[0] = 200;   //first element in the array
    num[1] = 100;   //second element in the array   
    num[2] = 300;   //third element in the array
        
    //Sort the list of numbers
    Arrays.sort(num);
        
        
    //Assign a new value to the second String
    //array element
    str[1] = "Better";
        
    //str[3] = "Doesn't exist";
        
    //Output the length of each array
    //Output the contents of each array
    System.out.println("String array length is: "+str.length);
    System.out.println("Integer array length is: "+num.length);
    System.out.println(num[0] +","+num[1]+","+num[2]);
    System.out.println(str[0] +","+str[1]+","+str[2]);
        
        
  } //end main
    
} //end class
