class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // 1: Emoji
    String[] emojis = {"1F600","1F601","1F602","1F603","1F604"};
    for(int x=0; x<=emojis.length-1; x++){
      print( convertToEmoji(emojis[x]) );
    }
    
    // 2: Total including tax
    double[] itemPrices = {23.45, 100, 43.59, 100.10,1.34};
    print( totalWithTax(itemPrices) );
    
    // 3: Integer Present ?
    int[] l1 = {1,4,-14,-345, 100,54,45,98,34,67,55,34,23,56,67};
    print( isPresent(l1,34));
    print( isPresent(l1,33));
    
    // 4: Lotto
    int[] lottoPicks = {1,12,23,34,54,33};
    int[] lottoDrawn = {4,15,9,34,54,33};
    print( checkLotto(lottoPicks, lottoDrawn));
    
    // 5: Largest integer in array
    print("");
    print(biggest(l1));
    
    // 6: First N prime #s
    int[] primes = primeList(10);
    print("Prime number list:");
    for(int x=0; x<=primes.length-1; x++)
      printt(primes[x]+", ");   

  }

  /* 1:  Create an array of emojis and then display each emoji.
When printing, use the fn convertToEmoji() provided below to display the actual emoji.

Look at "Lesson 21 CW_1_Solution": the rollDice() fn is an example of using unicodes as cards.
Resource for unicodes: 
https://unicode.org/emoji/charts/emoji-list.html
  */  
  String convertToEmoji(String code){
    return String.valueOf(Character.toChars( Integer.parseInt(code, 16) ));
  }


  /* 2:  Write a fn totalWithTax() that accepts an array of prices and returns the sum of the prices plus tax. Use the 2023 NYC sales tax rate of 8.875%.
To test the function, create an array of prices in the init function.
  */ 
  double totalWithTax(double[] prices){
    double sum=0;
    for(int x=0; x<= prices.length-1; x++){
      sum += prices[x];
    }
    double taxAmt = sum*0.08875;
    return sum+ taxAmt;
  }

  /* 3:  Create a fn isPresent() that accepts an array of integers and one integer number. Return true if the number is in the array; otherwise return false.
To test the fn, create an array of integers.
  */ 
  boolean isPresent(int[] nums, int n){
    for(int x=0; x<=nums.length-1; x++){
      if(nums[x]==n){
        return true;
      }
    }
    // if it's not found in the loop, return false
    return false;
  }


  /* 4:  Create a fn checkLotto() that accepts an array representing 6 lotto number picks and an array representing 6 lotto numbers drawn. It returns how many winning number picks were present among the lotto numbers drawn. 
HINT: make use of the function isPresent() from problem 3.

To test the function, create an array representing your lotto number picks and another array representing the lotto numbers drawn
  */ 
  int checkLotto(int[] picks, int[] drawn){
    int count=0;
    for(int x=0; x<=picks.length-1;x++){
      if( isPresent(drawn, picks[x])){
        count++;
      }
    }
    return count;
  }

  // 5: Write a fn biggest() that accepts an array of integers and returns the largest value in the array.
  int biggest(int[] nums){
    int largest = nums[0];
    for(int x=1; x<=nums.length-1; x++){
      if(nums[x]>largest){
        largest=nums[x];
      }
    }
    return largest;
  }
  
  /* 6:  Write a fn primeList() that takes in an integer N and returns the first N prime numbers. Use the function isPrime() provided to you.
  */ 
  int[] primeList(int N){
    int[] list = new int[N]; //create empty array of size N
    int num = 2; //check for all primes from 2 up
    for(int x=0; x<N; x++){
      while (!isPrime(num)){ //while the given # is not prime
        num++;
      }
      list[x]=num;
      num++; // get the next number to test
    }
    return list;
  }
  
  // fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) +lower;
  }
  // fn to determine prime # or not
  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor != 0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}