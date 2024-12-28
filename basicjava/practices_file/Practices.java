package com.mycompany.basicjava.practices_file;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
        String s,regex;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine().trim();
        regex = "[^a-zA-Z,+]";
        
        String[] tokens = s.split(regex);
        System.out.println(tokens.length);
        
        for (String i:tokens) {
            System.out.println(i);
        }
        
        
    }
}
