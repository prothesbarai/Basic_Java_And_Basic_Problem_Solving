package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Fibonacci_Series_And_Sum {

    public static void main(String[] args) {
        int num, first, second = 1, third = 0, sum = 0,position;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input An Integer Number : ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(third + " + ");
            sum += third;
            first = second;
            second = third;
            third = first + second;
        }
        System.out.println("\nTotal Sum = "+sum);

        
        // Find Fibonacci number specified position
        System.out.print("Find Any Position In Series : ");
        position = scanner.nextInt();
       
        if (position<=num) {
            
            first = 1;
            second = 1;
            third = 0;
            // Calculate Fibonacci number at the specified position
            for (int i = 1; i < position; i++) {
                first = second;
                second = third;
                third = first + second;
            }
            System.out.println("Fibonacci number at position " + position + " is: " + third);
            
        }else{
            System.out.println("Oh! No! Mistake Bro.");
        }
        
        
    }
}
