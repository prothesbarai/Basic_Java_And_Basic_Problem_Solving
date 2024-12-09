package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Verify_UserName_And_Password {

    public static int password;
    public static String user_name;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        while(true){
            try{
                userNamePass();
            if (user_name.contains("prothes") && password == 1234) {
                System.out.println("\n\nWelcome !\nThe END");
                break;
            }else{
                System.out.println("Try Again !");
                // Vull Data Clear Kore And Cache Clear Kore
                scanner.nextLine();
            }
            }catch(Exception e){
                System.out.println("Check Input Field");
                // Vull Data Clear Kore And Cache Clear Kore
                scanner.nextLine();
            }
        }
        
        
        

    }

    public static void userNamePass() {
        System.out.print("User Name : ");
        user_name = scanner.nextLine();

        System.out.print("Password : ");
        password = scanner.nextInt();
    }

}
