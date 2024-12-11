package com.mycompany.basicjava;

import java.util.Scanner;

public class Practices_Alll {
    
    public static void validateUsername(String username) {
        
        boolean isValid = true;

        // Check if the username is within the valid length range
        if (username.length() < 5 || username.length() > 15) {
            System.out.println("Invalid: The username must be between 5 and 15 characters long.");
            isValid = false;
        }

        // Check if the first character is a letter
        if (username.isEmpty() || !Character.isLetter(username.charAt(0))) {
            System.out.println("Invalid: The username must start with a letter.");
            isValid = false;
        }

        // Check if all characters are alphanumeric
        for (int i = 0; i < username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i))) {
                System.out.println("Invalid: The username can only contain letters and digits.");
                isValid = false;
                break; // No need to check further if one invalid character is found
            }
        }

        // If all conditions are satisfied
        if (isValid) {
            System.out.println("The username is valid.");
        }
    }
    
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        validateUsername(username);


        
    }
}
