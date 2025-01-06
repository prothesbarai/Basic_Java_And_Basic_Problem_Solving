package com.mycompany.basicjava.practices_file;

import java.util.Scanner;

public class Pro {
    public static void main(String[] args) {
        
        
        // C to F
        // Fahrenheit = (Celsius * 1.8) + 32
        double C,F;
        Scanner scanner = new Scanner(System.in);
        
        C = scanner.nextDouble();
        
        F = (C * 1.8) + 32;
        
        System.out.println("F : "+F);
        
    }
}
