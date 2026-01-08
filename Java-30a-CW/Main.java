class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    

    // display object property values

    
    // invoke object behaviors(functions)
   
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}