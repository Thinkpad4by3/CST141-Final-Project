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
import java.io.IOException;
import java.util.Scanner;
public class CheckGPA {
    public static double check(double gpa) {
        if(gpa < 0 || gpa > 4.0) {
            try {
                throw new IOException("Bad GPA");
            } catch (IOException e) {
                Scanner kb = new Scanner(System.in);
                do{
                    System.out.println("Enter a correct GPA: ");
                    gpa = kb.nextDouble();
                } while(gpa<0 || gpa > 4.0);
            }
        }
    return gpa;
    }
}
