package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_nth_Number_of_User_Validation_Check_Type1 {

    public static void main(String[] args) {
        int num;
        String userName;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number oF User : ");
        num = scanner.nextInt();
        scanner.nextLine(); // For Clear Scanner....Cache File

        for (int i = 1; i <= num; i++) {
            System.out.print("Username : ");
            userName = scanner.nextLine();
            userNameValidation(userName);
        }

    }
    
    
    public static void userNameValidation(String username){
        String regex = "^[a-zA-Z][a-zA-Z0-9_]*$";
        if (username.matches(regex) && username.length()>=8 && username.length()<=30) {
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
   
    
}
