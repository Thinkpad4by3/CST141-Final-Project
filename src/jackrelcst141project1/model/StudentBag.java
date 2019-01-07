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
public class StudentBag {
    Student studentbag[] = new Student[999];//declare student bag to null.
    int max;
    int next = 0;
    public StudentBag(int maxSize) {//contructor
        studentbag = new Student[maxSize]; //initalize studentbag to maxsize
        max = maxSize;
    }
    public void add(Student student){
        studentbag[next] = student;
        next++;
    }
    public Student findbyId(String id){
        Student student = null;//set student to return
        for (int x = 0;x < next;x++) {//loop through all students
            if (studentbag[x].getId().equals(id)) {//if equal ids
                student = studentbag[x];//set to return
            }
        }
        return student;//return
    }
    public Student removeById(String id) {
        Student student = null;//same as find by id
        int location = -1;
        for (int x = 0;x < next;x++) {
            if (studentbag[x].getId().equals(id)) {
                student = studentbag[x];
                location = x;
            }
        }
    
        //removing code
        if (location > -1) {//if not null
            for (int x = location+1;x < max;x++) {//loop every student to last spot
                studentbag[x-1] = studentbag[x];//do it
            }
        }
        next--;
        return student;
    }
    
    public void display(){
        int z = 0;
        for (int x = 0;x < (next);) {//loop through all students
            System.out.println(studentbag[x].fName + " " + studentbag[x].lName + " has ID number " + studentbag[x].id + " and lives at " + studentbag[x].address.display() + " and has the phone number " + studentbag[x].phone);
            System.out.print("     Courses Taken ");
            z=0;
            while (!(studentbag[x].getCoursesTook(z).equals(""))){
                 System.out.print(studentbag[x].getCoursesTook(z));
                 System.out.print(", ");
                 z++;
            }
            z=0;
            System.out.print("     Courses Taking ");
            while (!(studentbag[x].getCoursesTaking(z).equals(""))){
                 System.out.print(studentbag[x].getCoursesTaking(z));
                 System.out.print(", ");
                 z++;
            }
            z=0;
            System.out.print("     Courses To Take ");
            while (!(studentbag[x].getCoursesToTake(z).equals(""))){
                 System.out.print(studentbag[x].getCoursesToTake(z));
                 System.out.print(", ");
                 z++;
            }
            System.out.println();
          z=0; 
          x++;
        }
    }
    
    public void importText(String textFileName) throws FileNotFoundException, IOException {
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
                      studentbag[next] = new Student(studentdata[0],studentdata[1],studentdata[2],tempaddress,studentdata[9],Double.parseDouble(studentdata[10]));
                        y=0;
                        studentdata = templine[x+3].split(",");
                        while(!(studentdata[y].equals("!"))) {
                             //System.out.println(studentdata[y]);
                            studentbag[next].setCoursesTook(studentdata[y],y);
                            y++;
                        
                        }
                        studentdata = templine[x+4].split(",");
                        y=0;
                        
                           while(!(studentdata[y].equals("!"))) {
                            studentbag[next].setCoursesTaking(studentdata[y],y);
                            //System.out.println(studentdata[y]);
                            y++;
                           }
                        y=0;
                        studentdata = templine[x+5].split(",");
                          y=0;
                           while(!(studentdata[y].equals("!"))) {
                            studentbag[next].setCoursesToTake(studentdata[y],y);
                            //System.out.println(studentdata[y]);
                            y++;
                          }
                y=0;
                 next++;
            }
            
            
        } 
    }
}

