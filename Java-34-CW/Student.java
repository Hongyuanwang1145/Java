class Student{
  // variables
  String firstName;
  int gradeLevel;
  double[] grades;
  String[] courses;
  
  //constructor
  Student(String firstName, int gradeLevel, double[] grades, String[] courses){
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.grades     = grades;
    this.courses    = courses;
  }
  
  // class functions

  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1;x++){
      sum+=this.grades[x];
    }
    return sum/this.grades.length;
  }
  
  boolean checkCourse(String course){
    for(int x=0; x<=this.courses.length-1; x++){
      if(courses[x].equals(course)){
        return true;
      }
    }
    return false;
  }
  
}