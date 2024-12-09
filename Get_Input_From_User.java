package com.mycompany.basicjava;
import java.util.Scanner;

public class Get_Input_From_User {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int getUserInput;
        String myName;
        
        System.out.print("Please Enter Number : ");
        getUserInput = scanner.nextInt();
        System.out.print("Please Enter String : ");
        myName = scanner.next();
        
        System.out.println("Output : "+getUserInput+"\n"+myName+"\n");
    }
}
