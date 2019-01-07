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
public class FacultyBag {
    Faculty facultybag[];//declare faculty bag to null.
    int max;
    int next = 0;
    public FacultyBag(int maxSize) {//contructor
        facultybag = new Faculty[maxSize]; //initalize facultybag to maxsize
        max = maxSize;
    }
    public void add(Faculty faculty){
        facultybag[next] = faculty;
        next++;
    }
    public Faculty findbyId(String id){
        Faculty faculty = null;//set faculty to return
        for (int x = 0;x < max;x++) {//loop through all facultys
            if (facultybag[x].getId().equals(id)) {//if equal ids
                faculty = facultybag[x];//set to return
            }
        }
        return faculty;//return
    }
    public Faculty removeById(String id) {
        Faculty faculty = null;//same as find by id
        int location = -1;
        for (int x = 0;x < max;x++) {
            if (facultybag[x].getId().equals(id)) {
                faculty = facultybag[x];
                location = x;
            }
        }
    
        //removing code
        if (location > -1) {//if not null
            for (int x = location+1;x < max;x++) {//loop every faculty to last spot
                facultybag[x-1] = facultybag[x];//do it
            }
        }
        next--;
        return faculty;
    }
    
    public void display(){
        
        for (int x = 0;x < (next);) {//loop through all facultys
            
            System.out.println(facultybag[x].getFirstName() + " " + facultybag[x].getLastName() + " has ID number " + facultybag[x].getId() + " and lives at " + facultybag[x].address.display() + " and has the phone number " + facultybag[x].getPhone());
            x++;
            System.out.println("Hi");
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
                facultybag[next] = new Faculty(facultydata[0],facultydata[1],facultydata[2],tempaddress,salary,officeaddress,facultydata[14],facultydata[15]);
                next++;   
            }
            
        } 
    }
}
