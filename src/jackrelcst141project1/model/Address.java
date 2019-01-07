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
public class Address {//address class
    String stNumber;//street number public var
    String stName;//street name public var
    String city;//city public var
    String state;//state public var
    String zip;//zipcode number public var
    public Address(){//blank constructer
        stNumber = "2406";
        stName = "Capri Place";
        city = "North Bellmore";
        state = "NY";
        zip = "11710";
    }
    public Address(String sn, String sna, String c, String s, String z){ //full constructer
        stNumber = sn;
        stName = sna;
        city = c;
        state = s;
        zip = z;
    }
    
    public String getStreetNumber(){ //return street number as String
        return stNumber;
    }
    
    public void setStreetNumber(String x){ //Set Street number to specified value
        stNumber = x;
    }
    
    public String getStreetName(){ //return street number as String
        return stName;
    }
    
    public void setStreetName(String x){ //Set Street number to specified value
        stName = x;
    }
    
    public String getCity(){ //return street number as String
        return city;
    }
    
    public void setCity(String x){ //Set Street number to specified value
        city = x;
    }
    
    public String getState(){ //return street number as String
        return state;
    }
    
    public void setState(String x){ //Set Street number to specified value
        state = x;
    }
    
    public String getZip(){ //return street number as String
        return zip;
    }
    
    public void setZip(String x){ //Set Street number to specified value
        zip = x;
    }
    
    public String display() {//display address neatly
        String s = stNumber + " " + stName + " " + city + " " + state + " " + zip;
        return s;
    }
    
    
}
