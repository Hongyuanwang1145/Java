class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    /* 1  */  print("\n\n#1: Spaces");
    

    /* 2  */  print("\n\n#2: Harmonic");
    

    /* 3  */  print("\n\n#3: Sine");
    

    /* 4  */  print("\n\n#4: Fibonacci series");
    

    /* 5  */  print("\n\n#5: Multiplication Table");
    

    /* Bonus-1  */  print("\n\nBONUS-1: nCr");
    

    /* Bonus-2  */  print("\n\nBONUS-2: Binomial Expansion coefficients");
   
        
  }
  // Factorial function (to find n!, the factorial of a number n)
  int fact(int n){
    if(n==0)
      return 1; // 0! = 1
    else{
      int f=1;
      for(int x=1; x<=n; x++)
        f*=x;
      return f;
    }   
  }
/* #1: Write a function spaces() that accepts an integer N and returns a string of N spaces. In the init function display the string with the word "DONE" concatentated at the end.  
*/

  
/* #2: Write a function harmonic() that accepts an integer N and returns the sum of:
  1/1 + 1/2 + 1/3 + ...+ 1/N       
*/


/* #3: Approximate the Sine function. Using the formula in Sine.PNG/Sine.png, write a function sine() that accepts the number of terms to combine and the degree in radians (pi/6) and returns the sum.   
*/


/* #4: Write a function fib() that accepts an integer N and displays the first N Fibonacci numbers. The sequence of #s is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
  Example: N=6 , the function displays: 0, 1, 1, 2, 3, 5        
*/



/* #5: Create a function mTable() that displays the multiplication table as shown in file MultiplicationTable.png. [HINT: First, create a function tableRow() that can generate and display the numbers in one row. Use that function within a loop to generate all the rows.]       
*/



/* BONUS 1: Write a function nCr() that accepts 2 integers n and r and returns the # of combinations of n items taken r at a time. NOTE: Use the function fact() defined at the top to determine the factorials. Test this function before moving on to the next function.      
*/


/* BONUS 2:   Write a function binomExpnCoeff() that accepts an integer N and displays the binomial coefficients for the expansion of (A + B)^N.  (HINT: You do this by calling the nCr() function you wrote in a loop from 1 to N)
  Example: 
  Look at BinomialExapansion.png
  binomExpnCoeff(4) ==> 1 4 6 4 1
  binomExpnCoeff(5) ==> 1 5 10 10 5 1 
*/


  
  
}