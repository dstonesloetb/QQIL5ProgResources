class Lottery {
   
    public static void main(String[] args) {
      // Generate a sequence of 6 non repeating
      //random numbers in the range 1-59
      int[] nums = new int[60];
//        nums[0] = 0;
//        nums[1] = 1;
        
      for (int i=1; i<60; i++)
      {
        nums[i] = i;  //pop list 1-59
      }
        
      //shuffle the values in elements 1-59
      for (int i=1; i<60; i++)
      {
        int r = (int)Math.ceil(Math.random()*59);
        int temp = nums[i];
        nums[i] = nums[r];
        nums[r] = nums[i];
      } //end for 
        
      //Output only the values contained in
      //elements 1 -6 of the list
      for (int i=1; i <7; i++)
      {
        System.out.print(Integer.toString(nums[i])+" ");
      }
        
        
  }//end main 
} //end class 
