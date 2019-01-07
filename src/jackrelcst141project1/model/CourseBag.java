/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackrelcst141project1.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jasoni7
 */
public class CourseBag {
     Course coursebag[];//declare course bag to null.
    int max;
    int next = 0;
    public CourseBag(int maxSize) {//contructor
        coursebag = new Course[maxSize]; //initalize coursebag to maxsize
        max = maxSize;
    }
    public void add(Course course){
        coursebag[next] = course;
        next++;
    }
    public Course findbyISBN(String ISBN){
        Course course = null;//set course to return
        for (int x = 0;x < max;x++) {//loop through all courses
            if (coursebag[x].getISBN().equals(ISBN)) {//if equal ISBNs
                course = coursebag[x];//set to return
            }
        }
        return course;//return
    }
    public Course removeByISBN(String ISBN) {
        Course course = null;//same as find by ISBN
        int location = -1;
        for (int x = 0;x < max;x++) {
            if (coursebag[x].getISBN().equals(ISBN)) {
                course = coursebag[x];
                location = x;
            }
        }
    
        //removing code
        if (location > -1) {//if not null
            for (int x = location+1;x < max;x++) {//loop every course to last spot
                coursebag[x-1] = coursebag[x];//do it
            }
        }
        next--;
        return course;
    }
    
    public void display(){
        for (int x = 0;x < (next);x++) {//loop through all courses
            System.out.println(coursebag[x].courseTitle + " is " + coursebag[x].courseNumber + " has course number " + coursebag[x].textbookISBN + " and is published by " + coursebag[x].numberOfCredits + " credits");
        }
    }
    
    public void importText(String textFileName) throws FileNotFoundException, IOException {
         // The name of the file to open.
        String fileName = textFileName;
        String templine[] = new String[9999];
        int nextLine = 0;
        // This will reference one line at a time
        String line = null;
        int numofimports = 0;
        String coursedata[] = new String[8];
        Address tempaddress = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                templine[nextLine] = line;
                nextLine++;
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
        
        if(templine[0].equals("valid course file")) {
            numofimports = Integer.parseInt(templine[1]);
            for(int x = 0;x < (numofimports);x++) {
                coursedata = templine[x+2].split(",");
                coursebag[next] = new Course(coursedata[0],coursedata[1],coursedata[2],Integer.parseInt(coursedata[3]));
                next++;
            }
        } 
    }
}
