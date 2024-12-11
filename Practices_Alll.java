package com.mycompany.basicjava;
import java.util.Scanner;
public class Practices_Alll {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Read the number of usernames
        scanner.nextLine();         // Consume the newline

        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            if (isValidUsername(username)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }

    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]*$";
        if (username.matches(regex) && username.length()>=8 && username.length()<=30) {
            return true;
        }

        return false;
    }
}