package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Factorial_Calculate {
    public static void main(String[] args) {
        int num1, fact = 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Integer Number : ");
        num1 = scanner.nextInt();

        for (int i = 1; i<=num1; i++) {
            fact = fact * i;
        }
        
        System.out.println(num1+" Factorial Value is : "+fact);
        
    }
}
