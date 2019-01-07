/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackrelcst141project1.model;

import java.util.Random;

/**
 *
 * @author Jasoni7
 */
public class Student extends Person{
    String major; //Major public var
    String coursesTook[] = new String[9999];
    String coursesTaking[] = new String[9999];
    String coursesToTake[] = new String[9999];
    double gpa;
    Random r = new Random();
    
    
    public Student(){//blank constructer
        super("Jason","Jackrel","516-987-1234","2406","Capri Place","North Bellmore","New York","11710","512");
        
        for (int i = 0;i < 9999;i++) {
            coursesTook[i] = "";
         }
        for (int i = 0;i < 9999;i++) {
            coursesTaking[i] = "";
         }
        for (int i = 0;i < 9999;i++) {
            coursesToTake[i] = "";
         }
        super.fName = "Generic";
        super.lName = "McStudent";
        super.id="512";
        super.phone = "1-516-867-5309";
        super.address = new Address();
        coursesTook[0] = "CST111";
        coursesToTake[0] = "CST141";
        coursesTaking[0] = "CST112";
        gpa = 4.0;
    }
    public Student(String fn, String ln, String p, Address a,String i5,double g){ //full constructer
        super(fn,ln,p,a.getStreetNumber(),a.getStreetName(),a.getCity(),a.getState(),a.getZip(),i5);
        for (int i = 0;i < 9999;i++) {
            coursesTook[i] = "";
         }
        for (int i = 0;i < 9999;i++) {
            coursesTaking[i] = "";
         }
        for (int i = 0;i < 9999;i++) {
            coursesToTake[i] = "";
        }
        gpa = g;
    }
    public Student(Student s){
        
        try{
            super.fName = s.getFirstName();
        super.lName = s.getLastName();
        super.id = s.getId();
        super.phone = s.getPhone();
        super.address = s.getAddress();  
        }
        catch (NullPointerException e) {
            for (int i = 0;i < 9999;i++) {
            coursesTook[i] = "";
         }
        for (int i = 0;i < 9999;i++) {
            coursesTaking[i] = "";
         }
        for (int i = 0;i < 9999;i++) {
            coursesToTake[i] = "";
        super.fName = "Error";
        super.lName = "McJava";
        super.id="1024";
        super.phone = "1-516-ERR-JAVA";
        super.address = new Address();
        coursesTook[0] = "ERR404";
        coursesToTake[0] = "ERR141";
        coursesTaking[0] = "ERR112";
        gpa = 1.0;
        }
        }
       
    }
    
    public String getCoursesTook(int x){ //return super.address as Address
        return coursesTook[x];
    }
    
    public void setCoursesTook(String s, int i){ //Set super.address as Address
        coursesTook[i] = s;
    }
    
    public String getCoursesTaking(int x){ //return super.address as Address
        return coursesTaking[x];
    }
    
    public void setCoursesTaking(String s, int i){ //Set super.address as Address
        coursesTaking[i] = s;
    }
    
    public String getCoursesToTake(int x){ //return super.address as Address
        return coursesToTake[x];
    }
    
    public void setCoursesToTake(String s, int i){ //Set super.address as Address
        coursesToTake[i] = s;
    }
     public void setGPA(double x){ //return super.address as Address
        gpa = x;
    }
    
    public double getGPA(){
        return gpa;
}
    
}
