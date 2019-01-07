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
public class TextbookBag {
    Textbook textbookbag[];//declare textbook bag to null.
    int max;
    int next = 0;
    public TextbookBag(int maxSize) {//contructor
        textbookbag = new Textbook[maxSize]; //initalize textbookbag to maxsize
        max = maxSize;
    }
    public void add(Textbook textbook){
        textbookbag[next] = textbook;
        next++;
    }
    public Textbook findbyISBN(String ISBN){
        Textbook textbook = null;//set textbook to return
        for (int x = 0;x < max;x++) {//loop through all textbooks
            if (textbookbag[x].getISBN().equals(ISBN)) {//if equal ISBNs
                textbook = textbookbag[x];//set to return
            }
        }
        return textbook;//return
    }
    public Textbook removeByISBN(String ISBN) {
        Textbook textbook = null;//same as find by ISBN
        int location = -1;
        for (int x = 0;x < max;x++) {
            if (textbookbag[x].getISBN().equals(ISBN)) {
                textbook = textbookbag[x];
                location = x;
            }
        }
    
        //removing code
        if (location > -1) {//if not null
            for (int x = location+1;x < max;x++) {//loop every textbook to last spot
                textbookbag[x-1] = textbookbag[x];//do it
            }
        }
        next--;
        return textbook;
    }
    
    public void display(){
        for (int x = 0;x < (next);x++) {//loop through all textbooks
            System.out.println(textbookbag[x].title + " by " + textbookbag[x].author + " has ISBN number " + textbookbag[x].isbn + " and is published by " + textbookbag[x].publisher + " and costs " + textbookbag[x].price);
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
        String textbookdata[] = new String[8];
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
        
        if(templine[0].equals("valid textbook file")) {
            numofimports = Integer.parseInt(templine[1]);
            for(int x = 0;x < (numofimports);x++) {
                textbookdata = templine[x+2].split(",");
                textbookbag[next] = new Textbook(textbookdata[0],textbookdata[1],textbookdata[2],textbookdata[3],Double.parseDouble(textbookdata[4]));
                next++;
            }
        } 
    }
}
