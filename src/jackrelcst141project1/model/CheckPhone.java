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
public class CheckPhone {
    public static String check(String phone) {
        Scanner kb = new Scanner(System.in);
        phone = phone.trim();
        phone = phone.replaceAll("[-() ]", "");
        if (phone.length() != 10) {
            try {
                throw new IOException("Not 10 characters");
            } catch (IOException e) {
            do {
                System.out.println("Re-enter a 10-digit phonenumber: ");
                phone = kb.nextLine();
                phone = phone.trim();
                phone = phone.replaceAll("[-()]", "");
            } while (phone.length() != 10);
        }
    }
    return "(" + phone.substring(0, 3) + ") " +
    phone.substring(3,6) + "-" + phone.substring(6);
}
}

