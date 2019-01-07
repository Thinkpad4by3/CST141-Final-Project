/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackrelcst141project1.model;

/**
 *
 * @author Jasoni7
 */
public class Course {
    String courseTitle;
    String courseNumber;
    String textbookISBN;
    int numberOfCredits;
    
    public Course(){//blank constructer
        courseTitle = "Intro to Java";
        courseNumber = "CST112";
        textbookISBN = "0133761312";
        numberOfCredits = 4;
    }
    public Course(String ct, String cn, String ti, int noc){ //full constructer
    courseTitle = ct;
    courseNumber = cn;
    textbookISBN = ti;
    numberOfCredits = noc;
    }
    
    public String getISBN(){ //return isbn as String
        return textbookISBN;
    }
    
    public void setISBN(String x){ //return isbn as String
        textbookISBN = x;
    }
    
    
    public String getCourseTitle(){ //return phone as String
        return courseTitle;
    }
    
    public void setCourseTitle(String x){ //Set phone to specified value
        courseTitle = x;
    }
    
    
      public int getNumberOfCredits(){ //return address as Address
        return numberOfCredits;
    }
    
    public void setPrice(int x){ //Set address as Address
        numberOfCredits = x;
    }
    
      public String getCourseNumber(){ //return address as Address
        return courseNumber;
    }
    
    public void setCourseNumber(String x){ //Set address as Address
        courseNumber = x;
    }
    
    
}
