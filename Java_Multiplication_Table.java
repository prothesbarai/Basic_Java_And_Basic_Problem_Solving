package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Multiplication_Table {
    public static void main(String[] args) {
        int mul,num1,num2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Integer Number From : ");
        num1 = scanner.nextInt();
        System.out.print("Input Integer Number To : ");
        num2 = scanner.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= 10; j++) {
                mul = j * i;
                System.out.println(i+"*"+j + " = " + mul);
            }
            
            System.out.println("\n\n");
        }
        
    }
}
