class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

   
  }
  /*
  Problem 1:
  Write a function addNums() that returns a string displaying the addition of two random integers that range from -50 to 50 inclusively. 
  Example:
  addNums()==> "-23 + 10 = ?"
  addNums()==> "17 + 41 = ?"
  */
String addNums(){
  int n1 = (int)(Math.random()*(50(-50)+1))+50(-50);
  int n2 = (int)(Math.random()*101)-50;
  return n1 "+" n2 +"="
}

  /*
  Problem 2:
  Write a function generatePIN() that generates a random PIN, with each digit being from 3 to 8.
  Example:
  generatePin() ==> 4547
  generatePin() ==> 8365
  */

  
}