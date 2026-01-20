class Student{
  // class variables  
  String firstName;
  int gradeLevel;
  double gpa;
  double[] grades;

  // constructor
  Student(String firstName, int gradeLevel, double gpa, 
          double[] grades){
    
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
    this.grades     = grades;
  }

  // class fn for grade average
  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1; x++){
      sum += this.grades[x];
    }
    return sum/this.grades.length;
  }
  
  // class fn to check course matching
  
  
}