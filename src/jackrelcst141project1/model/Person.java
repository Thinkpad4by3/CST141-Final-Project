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
public class Person {
    String fName;//street number public var
    String lName;//street name public var
    String id;//static id public var, unique
    String phone;//phone public var
    Address address;//Address public var
    Random r = new Random();
    
    public Person(){//blank constructer
        fName = "Jason";
        lName = "Jackrel";
        phone = "1-516-867-5309";
        address = new Address();
        id = "1023";
    }
    public Person(String fn, String ln, String p, String num,String str, String city, String ste, String zip, String i5){ //full constructer
        fName = fn;
        lName = ln;
        id = i5;
        phone = p;
        Address temp = new Address(num,str,city,ste,zip);
        address = temp;
    }
    
    public Person(Person s){
            fName = s.fName;
        lName = s.lName;
        id = s.id;
        phone = s.phone;
        address = s.address;
    }
    
    public String getFirstName(){ //return First Name as String
        return fName;
    }
    
    public void setFirstName(String x){ //Set First Name to specified value
        fName = x;
    }
    
    public String getLastName(){ //return Last Name as String
        return lName;
    }
    
    public void setLastName(String x){ //Set Last Name as string
    }
    
    public String getId(){ //return id as String
        return id;
    }
    
    public void setId(String i){ //return id as String
        id = i;
    }
    
    public String getPhone(){ //return phone as String
        return phone;
    }
    
    public void setPhone(String x){ //Set phone to specified value
        phone = x;
    }
    
    public Address getAddress(){ //return address as Address
        return address;
    }
    
    public void setAddress(Address x){ //Set address as Address
        address = x;
    }
}
