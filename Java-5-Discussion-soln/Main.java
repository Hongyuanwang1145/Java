class Main {
  
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println("Integer division");
    System.out.println(1/2);
    System.out.println(3/2);
    
    /*
    Integer division truncates (cuts off) the decimal portion. You only get the integer part.
    It happens when you divide(/) an integer by another integer.

    To avoid integer division, ensure that either the numerator or the denominator (or both) is not an integer. Preferably make it a double.   
    */
    System.out.println("Avoiding integer division");
    System.out.println(3.0/2);
    
    System.out.println(3/2.0);

    System.out.println(3.0/2.0);

 // Modulus (division remainder) operator %
    System.out.println("Modulus % operator");
    System.out.println(5%2);
    
    System.out.println(3%5);
    
    System.out.println(5%5);

    System.out.println(-5%2);
    
    System.out.println(-5%-3);

    // How can modulus be used to determine if an integer is even or odd?
  }

  
}