package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_String_Checker_Without_Speacial_Character {
    public static void main(String[] args) {
        String getString;
        boolean conditions = true;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input An String : ");
        getString = scanner.nextLine();

        for (int i = 0; i <getString.length(); i++) {
            if(!Character.isLetterOrDigit(getString.charAt(i))){
                conditions = false;
                break;
            }else{
                conditions = true;
            }
        }
        
        
        if (conditions) {
            System.out.println("Valid String");
        }else{
            System.out.println("Non Valid String");
        }
        
    }
}
