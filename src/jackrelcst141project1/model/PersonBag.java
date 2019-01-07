/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jackrelcst141project1.model;
import java.io.*;
/**
 *
 * @author Jasoni7
 */
public class PersonBag {
    Person personbag[];//declare person bag to null.
    int max;
    int next = 0;
    public PersonBag(int maxSize) {//contructor
        personbag = new Person[maxSize]; //initalize personbag to maxsize
        max = maxSize;
    }
    public void add(Person person){
        personbag[next] = person;
        next++;
    }
    public Person findbyId(String id){
        Person person = null;//set person to return
        for (int x = 0;x < max;x++) {//loop through all persons
            if (personbag[x].getId().equals(id)) {//if equal ids
                person = personbag[x];//set to return
            }
        }
        return person;//return
    }
    public Person removeById(String id) {
        Person person = null;//same as find by id
        int location = -1;
        for (int x = 0;x < max;x++) {
            if (personbag[x].getId().equals(id)) {
                person = personbag[x];
                location = x;
            }
        }
    
        //removing code
        if (location > -1) {//if not null
            for (int x = location+1;x < max;x++) {//loop every person to last spot
                personbag[x-1] = personbag[x];//do it
            }
        }
        next--;
        return person;
    }
    
    public void display(){
        for (int x = 0;x < (next);x++) {//loop through all persons
            System.out.println(personbag[x].fName + " " + personbag[x].lName + " has ID number " + personbag[x].id + " and lives at " + personbag[x].address.display() + " and has the phone number " + personbag[x].phone);
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
        String persondata[] = new String[99];
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
        
        if(templine[0].equals("valid person file")) {
            numofimports = Integer.parseInt(templine[1]);
            for(int x = 0;x < (numofimports);x++) {
                persondata = templine[x+2].split(",");
                personbag[next] = new Person(persondata[0],persondata[1],persondata[2],persondata[3],persondata[4],persondata[5],persondata[6],persondata[7],persondata[8]);
                next++;
            }
        } 
    }
    }
    

