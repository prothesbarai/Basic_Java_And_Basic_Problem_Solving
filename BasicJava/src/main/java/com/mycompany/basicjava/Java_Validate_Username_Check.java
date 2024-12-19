package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_Validate_Username_Check {
    
    public static String username;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("UserName : ");
        username = scanner.nextLine();
        
        validateUserName(username);
    }
    
    /*
        Check User Name Length
        Check if the first character is a letter
        Check Case Sensative
        Check if all characters are alphanumeric
    */
    public static void validateUserName(String username){
        boolean isValid = true;
        // Check User Name Length
        if (username.length()<5 || username.length()>15) {
            System.out.println("Invalid Username! Must be upto 5 and less than 15");
            isValid = false;
        }
        // Check if the first character is a letter
        if (username.length() == 0  || !Character.isLetter(username.charAt(0))) {
            System.out.println("Invalid Username! First Character Must Be Letter");
            isValid = false;
        }
        // Check Case Sensative
        if (!username.equals(username.toLowerCase())) {
            System.out.println("Invalid Userbame! Username Must be Lowercase");
            isValid = false;
        }
        // Check if all characters are alphanumeric
        for (int i = 0; i < username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i))) {
                System.out.println("Invalid Userbame! Username Must be letter,number");
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.println("Valid Username");
        }
    }
    
}