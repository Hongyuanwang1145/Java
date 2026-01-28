class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list = new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // Use the array of students called "students" and the functions from the 'Student' class of the prior lesson to answer the questions listed below:  
    int passing = 0;

    int failing = 0;


    // 1: How many students are passing and how many are failing?
    for(int 1=0 1<student.passing = 1++){
      
    // 2: What percentage of students are failing?

    // 3: How many failing students have "Castro R" as their teacher?

    // 4: How many failing students are not taking a Music course? (Note: Music courses start with "UL")

    // 5: Display the IDs of all students taking music, but failing it (music courses start with "UL").

    // 6: How many freshmen and sophomores have a GPA over 90?

    // 7: How many students have both of the following teachers: Banu and Porchetta?

    // 8: How many freshmen, sophomores, juniors and seniors are there?

    // 9: For teacher Porchetta's students, display the number of students by grade level.
    
    }
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}