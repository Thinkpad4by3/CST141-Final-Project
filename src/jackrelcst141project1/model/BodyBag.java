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
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *
 * @author Jasoni7
 */
public class BodyBag{
    int maxSize;
    Person bodybag[];
    boolean bodytype[];
    int next = 0;
    public BodyBag(int ms) {
        maxSize = ms;
        bodybag = new Person[maxSize];
        bodytype = new boolean[maxSize];
    }
    
    public void addPerson(Person person){
        bodybag[next] = person;
        if(person instanceof Student) {
            bodytype[next] = true;
        }
        else
        {
            bodytype[next] = false;
        }
        next++;
    }
    
    public Person findbyId(String id){
        Person person = null;//set person to return
        for (int x = 0;x < maxSize;x++) {//loop through all persons
            if (bodybag[x].getId().equals(id)) {//if equal ids
                person = bodybag[x];//set to return
            }
        }
        return person;//return
    }
    
    public Person removebyId(String id){
        Person person = null;//set person to return
        int y = 0;
        for (int x = 0;x < maxSize;x++) {//loop through all persons
            if (bodybag[x].getId().equals(id)) {//if equal ids
                person = bodybag[x];//set to return
                y = x;
            }
        }
        for (int x = y;x < maxSize;x++) {
            bodybag[x] = bodybag[x+1];
        }
        return person;//return
    }
    
    public void displayStudentsInOrder() {
         Student temppsn[] = new Student[maxSize];
         int nextstu = 0;
         int numOfStu = 0;
         for (int x = 0;x < maxSize;x++) {
             if (bodytype[x] == true) {
                 numOfStu++;
             }
         }
         double iarr[] = new double[numOfStu+2];
         temppsn = new Student[numOfStu];
         numOfStu = 0;
           for (int x = 0;x < next;x++) {
               
             if (bodytype[x] == true) {
                 temppsn[numOfStu] = (Student) bodybag[x];
                 iarr[numOfStu] = (double) temppsn[numOfStu].getGPA();
                 numOfStu++;
             }
         }
           Arrays.sort(iarr);
          for (int x=0;x<iarr.length;x++) {
              for (int y = 0; y < numOfStu;y++) {
                  if (temppsn[y].getGPA() == iarr[x]) {
                      if (iarr[x] == iarr[x+1]) {
                          iarr[x+1] = 100;
                      }
                       System.out.println(temppsn[y].getFirstName() + " " + temppsn[y].getLastName() + " has a GPA of " + temppsn[y].getGPA());
                  }
                  
              }
          }
           
    }
    
    public void displayFacultyInOrder() {
         Faculty temppsn[] = new Faculty[maxSize];
         int nextstu = 0;
         int numOfStu = 0;
         for (int x = 0;x < maxSize;x++) {
             if (bodytype[x] == false) {
                 numOfStu++;
             }
         }
         double iarr[] = new double[numOfStu];
         temppsn = new Faculty[numOfStu];
         numOfStu = 0;
           for (int x = 0;x < next;x++) {
             if (bodytype[x] == false) {
                 temppsn[numOfStu] = (Faculty) bodybag[x];
                 iarr[x] = (double) temppsn[numOfStu].getSalary();
                
                 numOfStu++;
             }
         }
           Arrays.sort(iarr);
          for (int x=0;x<iarr.length;x++) {
              for (int y = 0; y < numOfStu;y++) {
                  if (temppsn[y].getSalary() == iarr[x]) {
                       System.out.println(temppsn[y].getFirstName() + " " + temppsn[y].getLastName() + " has a salary of " + temppsn[y].getSalary());
                  }
              }
             
          }
           
    }
    
    public void printStudentsInOrder(String fileWrite) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(fileWrite, "UTF-8");
         Student temppsn[] = new Student[maxSize];
         int nextstu = 0;
         int numOfStu = 0;
         for (int x = 0;x < maxSize;x++) {
             if (bodytype[x] == true) {
                 numOfStu++;
             }
         }
         double iarr[] = new double[numOfStu];
         temppsn = new Student[numOfStu];
         numOfStu = 0;
           for (int x = 0;x < maxSize;x++) {
             if (bodytype[x] == true) {
                 temppsn[numOfStu] = (Student) bodybag[x];
                 iarr[numOfStu] = (double) temppsn[numOfStu].getGPA();
                
                 numOfStu++;
             }
         }
           Arrays.sort(iarr);
          for (int x=0;x<iarr.length;x++) {
              for (int y = 0; y < numOfStu;y++) {
                  if (temppsn[y].getGPA() == iarr[x]) {
                       if (iarr[x] == iarr[x+1]) {
                          iarr[x+1] = 100;
                      }
                       writer.println(temppsn[y].getFirstName() + " " + temppsn[y].getLastName() + " has a GPA of " + temppsn[y].getGPA());
                  }
              }
             
          }
          writer.close();
           
    }
    
    public void printFacultyInOrder(String fileWrite) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(fileWrite, "UTF-8");
         Faculty temppsn[] = new Faculty[maxSize];
         int nextstu = 0;
         int numOfStu = 0;
         for (int x = 0;x < maxSize;x++) {
             if (bodytype[x] == false) {
                 numOfStu++;
             }
         }
         double iarr[] = new double[numOfStu];
         temppsn = new Faculty[numOfStu];
         numOfStu = 0;
           for (int x = 0;x < next;x++) {
             if (bodytype[x] == false) {
                 temppsn[numOfStu] = (Faculty) bodybag[x];
                 iarr[x] = (double) temppsn[numOfStu].getSalary();
                
                 numOfStu++;
             }
         }
           Arrays.sort(iarr);
          for (int x=0;x<iarr.length;x++) {
              for (int y = 0; y < numOfStu;y++) {
                  if (temppsn[y].getSalary() == iarr[x]) {
                       writer.println(temppsn[y].getFirstName() + " " + temppsn[y].getLastName() + " has a salary of " + temppsn[y].getSalary());
                  }
              }
             
          }
          writer.close();
           
    }
    
    public void importStudents(String textFileName) throws FileNotFoundException, IOException {
         // The name of the file to open.
         int y = 0;
        String fileName = textFileName;
        String templine[] = new String[9999];
        int nextLine = 0;
        // This will reference one line at a time
        String line = null;
        int numofimports = 0;
        String studentdata[] = new String[9999];
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
        
        if(templine[0].equals("valid student file")) {
            numofimports = Integer.parseInt(templine[1]);
            for(int x = 0;x < ((numofimports)*4);x=x+4) {
                studentdata = templine[x+2].split(",");
                
                
                      tempaddress = new Address(studentdata[3],studentdata[4],studentdata[5],studentdata[6],studentdata[7]);
                      bodybag[next] = new Student(studentdata[0],studentdata[1],studentdata[2],tempaddress,studentdata[9],Double.parseDouble(studentdata[10]));
                        y=0;
                        studentdata = templine[x+3].split(",");
                        while(!(studentdata[y].equals("!"))) {
                             //System.out.println(studentdata[y]);
                            ((Student)bodybag[next]).setCoursesTook(studentdata[y],y);
                            y++;
                        
                        }
                        studentdata = templine[x+4].split(",");
                        y=0;
                        
                           while(!(studentdata[y].equals("!"))) {
                            ((Student)bodybag[next]).setCoursesTaking(studentdata[y],y);
                            //System.out.println(studentdata[y]);
                            y++;
                           }
                        y=0;
                        studentdata = templine[x+5].split(",");
                          y=0;
                           while(!(studentdata[y].equals("!"))) {
                            ((Student)bodybag[next]).setCoursesToTake(studentdata[y],y);
                            //System.out.println(studentdata[y]);
                            y++;
                          }
                y=0;
                 bodytype[next] = true;
                 next++;
                
            }
            
            
        } 
    }
    
    public void importFaculty(String textFileName) throws FileNotFoundException, IOException {
         // The name of the file to open.
        String fileName = textFileName;
        String templine[] = new String[9999];
        int nextLine = 0;
        // This will reference one line at a time
        String line = null;
        int numofimports = 0;
        String facultydata[] = new String[8];
        Address tempaddress = null;
        Address officeaddress = null;
        double salary = 0;
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
        
        if(templine[0].equals("valid faculty file")) {
            numofimports = Integer.parseInt(templine[1]);
            for(int x = 0;x < (numofimports);x++) {
                facultydata = templine[x+2].split(",");
                tempaddress = new Address(facultydata[3],facultydata[4],facultydata[5],facultydata[6],facultydata[7]);
                officeaddress = new Address(facultydata[8],facultydata[9],facultydata[10],facultydata[11],facultydata[12]);
                salary = Double.parseDouble(facultydata[13]);
                bodybag[next] = new Faculty(facultydata[0],facultydata[1],facultydata[2],tempaddress,salary,officeaddress,facultydata[14],facultydata[15]);
                bodytype[next] = false;
                next++; 
                
            }
            
        } 
    }
    
}

