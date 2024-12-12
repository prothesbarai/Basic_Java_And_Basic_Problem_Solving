package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_nth_Number_of_User_Validation_Check_Type2 {
    public static void main(String[] args) {
        int num;
        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of User : ");
        num = scanner.nextInt();
        scanner.nextLine(); // Clear Scanner Cache File
        
        for (int i = 1; i <= num; i++) {
            System.out.print("UserName : ");
            userName = scanner.nextLine();
            if (isValidUserName(userName)) {
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }
        
    }
    
    public static boolean isValidUserName(String username){
        String regex = "^[a-zA-Z][a-zA-Z0-9_]*$";
        if (username.matches(regex) && username.length()>=8 && username.length()<=30) {
            return true;
        }
        return false;
    }
    
}
