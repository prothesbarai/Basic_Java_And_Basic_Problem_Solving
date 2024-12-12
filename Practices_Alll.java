package com.mycompany.basicjava;

import java.util.Scanner;

public class Practices_Alll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        
        String regex = "a...b";
        
        if (n.matches(regex)) {
            System.out.println("Match");
        }else{
            System.out.println("No Match");
        }
        
    }
}
