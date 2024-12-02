class Pow {
  public static void main(String[] args) {
    int num = 9;
        
    int square = (int) Math.pow(num, 2); // 9*9 = 81
    int sqrt = (int) Math.sqrt(num);  // sqrt(9) -> 3
        
    System.out.println("Num: "+num);  //9
    System.out.println("Square: "+square);
    System.out.println("Sqrt: "+sqrt);
  }
}
