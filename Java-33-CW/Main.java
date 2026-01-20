class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // define arrays of grades
    double[] g1 = {60,70,90};
    double[] g2 = {95,75,80,83,97};
	
    // define arrays of courses 
    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    
    // Create new student objects
    Student student1 = new Student("Tom",9,g1,courses1);
    Student student2 = new Student("Jerry",11,g2,courses2);

    /*
    1)  Display the first name of all students with an average 
        grade over 70.
      */
    print("Students with avg over 70:");
    if (student1.calculateAvg() > 70)
    print(student1.firstName);

    /*
    2)  Display the first name of all students that are sophomores 
        or below, and whose average grade is between 70 and 80 inclusive.
      */   
    print("\nStudents in gr.10 or below with avg 70-80:");
    if (student1.calculateAvg() >=70 && studen1.calculateAvg <= 80 && student1.grade1 <= 10)
   
  }

}