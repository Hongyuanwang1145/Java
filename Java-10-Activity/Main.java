class Main {
  public static void main(String[] args) {
      (new Main()).init();
  }

  void init(){
   // Invoke functions with appropriate arguments
   System.out.println(gpa(99));
   System.out.println(isGraduating("Senior",44));
   System.out.println(BMI(150,67));
   System.out.println(shippingCost(20));
   System.out.println(blueOrViolet(650));


  }

/* Challenge 1:
  Write a function "gpa" that takes in the GPA value and returns the following: 
  if GPA is over 90, return GPA weighted by an extra 10%;
  otherwise return the raw GPA.
*/
double gpa(double gpa){
  if(gpa>90){
    return gpa*1.1;
  }else{
    return gpa;
  }
}

  
/* Challenge 2:
    Write a function "isGraduating" that accepts a grade level and number of credits earned. It returns the boolean value TRUE if a student is a Senior and has 44 or more credits; otherwise it returns FALSE. 
  
  In the init() function:
  Display to console "Student Graduating" or "Student NOT Graduating" depending on the value returned by the function.
*/
boolean isGraduating(String grade, double credits){
  if(grade == "Senior"&& credits >=44){
    return true;
  }else{
    return false;
  }
}


/* Challenge 3:  BMI
  Write a function "BMI" that accepts a weight in pounds and a height in inches. 
  Calculate the BMI (search up the formula) and return the following:
    BMI 18.4 or less:  return Underweight
    BMI over 18.4 to under 25.0:  return Normal
    BMI of 25.0 or more to under 40.0:  return Overweight
    BMI of 40.0 or more:  return  Obese 
    formula: BMI = (pounds/(inches)^2)*703
*/
String BMI(double weight, double height){
  double BMI = (weight/Math.pow(height,2))*703;
  if(BMI<=18.4){
    return "Underweight";
  }else if(BMI>18.4&&BMI<25.0){
    return "Normal";
  }else if(BMI>24.9&&BMI<40.0){
    return "Overweight";
  }else if(BMI>39.9){
    return "Obese";
  }else{
    return "error";
  }
}

/* Challenge 4:
  Write a function "shippingCost" that accepts a weight in pounds and returns:
       0.00, if 10 pounds or less,
       5.00, if more than 10 pounds but 15 pounds or less,
       10.00, if more than 15 pounds but 25 pounds or less,
       10.00 plus 2 cents per pound over 25 pounds, if over 25 pounds.
*/
double shippingCost(double weight){
  if(weight<=10){
    return 0.00;
  }else if(weight>10&&weight<=15){
    return 5.00;
  }else if(weight>15&&weight<=25){
    return 10.00;
  }else if(weight>25){
    return 10+weight*0.02;
  }else{
    return 0;
  }
}

/* Challenge 5:
  Write a function "blueOrViolet" that accepts a light frequency in THz and returns true for either blue frequencies (600-670 THz inclusive) or violet frequencies (700-750 THz inclusive), otherwise return false.
*/
boolean blueOrViolet(int Thz){
  if((Thz>=600&&Thz<=670)||Thz>=700&&Thz<=750){
    return true;
  }else{
    return false;
  }
}

  
} 