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
public class Textbook {
    String title;
    String author;
    String publisher;
    static String isbn;
    double price;
    
    public Textbook(){//blank constructer
        title = "Introduction to Java Programming, Comprehensive Version";
        author = "Y. Daniel Liang";
        publisher = "Prentice Hall";
        isbn = "0133761312";
        price = 53.99;
    }
    public Textbook(String t, String a, String p, String i, double pr){ //full constructer
        title = t;
        author = a;
        price = pr;
        isbn = i;
        publisher = p;
    }
    
    public String getISBN(){ //return isbn as String
        return isbn;
    }
    
    
    public String getAuthor(){ //return phone as String
        return author;
    }
    
    public void setAuthor(String x){ //Set phone to specified value
        author = x;
    }
    
    
      public double getPrice(){ //return address as Address
        return price;
    }
    
    public void setPrice(double x){ //Set address as Address
        price = x;
    }
    
      public String getPublisher(){ //return address as Address
        return publisher;
    }
    
    public void setPublisher(String x){ //Set address as Address
        publisher = x;
    }
    
      public String getTitle(){ //return title as string
        return title;
    }
    
    public void setTitle(String x){ //Set title
        title = x;
    }
}
