package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Sub_of_Even_Number {
    public static void main(String[] args) {
        int num1,sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Integer Number : ");
        num1 = scanner.nextInt();
        
        for (int i = 2; i <= num1; i = i + 2) {
            sum = sum + i;
        }
        
        System.out.println("2 to "+num1+" Total Even Numbers Sum is : "+sum);
        
    }
}
