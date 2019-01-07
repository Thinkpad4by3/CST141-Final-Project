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
public class Faculty extends Person{
    double salary; //salary public double
    Address officeAddress; //office address public var
    String title;
    Random r = new Random();
    
    public Faculty(){//blank constructer
        super("Blank","Bling","5678","1-631-867-5309","6789","Main Street","Trenton","New Jersey","11439");
        salary = 100000;
    }
    public Faculty(String fn, String ln, String p, Address a,double s, Address oa, String t,String i5){ //full constructer
        super(fn,ln,p,a.getStreetNumber(),a.getStreetName(),a.getCity(),a.getState(),a.getZip(),i5);
        officeAddress = oa;
        title = t;
        salary = s;
    }
    
    public Faculty(Faculty s){
          try{
            super.fName = s.getFirstName();
        super.lName = s.getLastName();
        super.id = s.getId();
        super.phone = s.getPhone();
        super.address = s.getAddress();  
        }
        catch (NullPointerException e) {
        super.fName = "Error";
        super.lName = "McJava";
        super.id="1024";
        super.phone = "1-516-ERR-JAVA";
        super.address = new Address();
        title = "Mr.McJava";
        salary = 404;
        Address temp = new Address ();
        officeAddress = (temp);
        
        }
        }
    
      public double getSalary(){ //return address as Address
        return salary;
    }
    
    public void setSalary(double x){ //Set address as Address
        salary = x;
    }
    
      public Address getOfficeAddress(){ //return address as Address
        return officeAddress;
    }
    
    public void setOfficeAddress(Address x){ //Set address as Address
        officeAddress = x;
    }
    
      public String getTitle(){ //return address as Address
        return title;
    }
    
    public void setTitle(String x){ //Set address as Address
        title = x;
    }
    
}
