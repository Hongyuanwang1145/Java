class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
/*
    Challenge 1:
    Write a function creditCardType() that accepts a credit card number (as a string) and returns the type of credit card based on the starting numbers (see below)
    Starts with:
    4 - Visa
    34 or 37 - American Express
    36 - Diner's Club
    51 or 55 - Mastercard
    6011 or 65 - Discover
    */
     String creditCardType(String card){
      if(start.substring(0,1).equals("4")){
        return "Visa";
      }else if(start.substring(0,2).equals("34")||start.substring(0,2).equals("37")){
        return "American Express";
      }else if(start.substring(0,2).equals("36")){
        return "Diner's Club";
      }else if(start.substring(0,2).equals("51")||start.substring(0,2).equals("55")){
        return "Mastercard";
      }else if(start.substring(0,4).equals("6011")||start.substring(0,2).equals("65")){
        return "Discover";
      }else{
        return "error";

      }
      
    }
    /*
    Challenge 2:
    Write a function pigLatin() which accepts a word and returns a new word made up by switching the fist letter with the rest of the word and adding "ay" after. Example: "pig"==> "igpay"
    */
    String pigLatin(String word){
      return word.substring(1)+word.substring(0,1) + "ay";
    }
    /*
    Challenge 3:
    Write a function nycLocate() that accepts a zip code (as a string) and returns the appropriate NYC borough determined by the fist three numbers of the zip code.
    Starting numbers of zip code:
    Manhattan :100, 101, 102
    Staten Island : 103
    Bronx : 104
    Brooklyn : 112
    Queens : 113, 114, 111
    */
String nycLocate(String zipcode){
    if(zipcode.substring(0,3).equals("100")||zipcode.substring(0,3).equals("101")||zipcode.substring(0,3).equals("102")){
      return "Manhattan";
    }else if (zipcode.substring(0,3).equals("103")){
      return "Staten Island";
    }else if (zipcode.substring(0,3).equals("104")){
      return "Bronx";
    }else if (zipcode.substring(0,3).equals("112")){
      return "Brooklyn";
    }else if (zipcode.substring(0,3).equals("113")||zipcode.substring(0,3).equals("114")||zipcode.substring(0,3).equals("111")){
      return "Queens";
    }else{
      return "error";
    }
   }
  

    /*
    Challenge 4:
    Create a function getMonth() that accepts a date in the format MM/DD/YYYY and returns the month: Example 07/21/2023 ==> "July"
  */
      String getMonth(String date){
        if(date.substring(0,2).equals("01")){
          return "January";
        }else if(date.substring(0,2).equals("02")){
          return "February";
        }else if(date.substring(0,2).equals("03")){
          return "March";
        }else if(date.substring(0,2).equals("04")){
          return "April";
        }else if(date.substring(0,2).equals("05")){
          return "May";
        }else if(date.substring(0,2).equals("06")){
          return "June";
        }else if(date.substring(0,2).equals("07")){
          return "July";
        }else if(date.substring(0,2).equals("08")){
          return "August";
        }else if(date.substring(0,2).equals("09")){
          return "September";
        }else if(date.substring(0,2).equals("10")){
          return "October";
        }else if(date.substring(0,2).equals("11")){
          return "November";
        }else if(date.substring(0,2).equals("12")){
          return "December";
        }else{
          return "error";
        }
      }
  
  
    /*
    Challenge 5:
    Create a function validatePswd() that accepts a password. The password must have 5 to 8 characters that are letters, numbers or any symbol except ^, *, (, )
    Return true if it's a valid password; otherwise return false.
    */
boolean validatePswd(String pwd){
    if(pwd.length()>=5&&pwd.length()<=8&&!pwd.contains("^")&&!pwd.contains("*")&&!pwd.contains("(")&&!pwd.contains(")")){
      return true;
    }else{
      return false;
    }
   }
  
}