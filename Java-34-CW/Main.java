class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
    double[] g1 = {60,70,90};
    double[] g2 = {65,75,60,88};
    double[] g3 = {78,70,80,100,84};
    double[] g4 = {64,77};
    double[] g5 = {77,76,98,70};

    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    String[]  courses3  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    String[]  courses4  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    String[]  courses5  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    
    //Create an array of students 
    Student[] studentList = new Student[5];

    // Create new student object and assign to each array item     
    studentList[0] = new Student("Tom",   9,g1,courses1);
    studentList[1] = new Student("Jerry",11,g2,courses2);
    studentList[2] = new Student("Ben",  10,g3,courses3);
    studentList[3] = new Student("Mary", 12,g4,courses4);
    studentList[4] = new Student("Jane",  9,g5,courses5);

    // Task 1: Display the grade average of each student
    print("Grade averages");
    int count =0;
    for(int x=0; x<=studentList.length-1; x++){
      Student student = studentList[x];
      print("Student" + (x+1) + ": "+ student.calculateAvg() );
    }
    
    // Task 2: Display the number of students with an average above 80
    if(student.calculateAvg > 80){
      count++;
    }
    print("# of students with avg above 80 is "+count);
  }

}