package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Check_Multi_Prime_Numer_With_Sum {

    public static void main(String[] args) {
        int num1, num2, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Integer Number From: ");
        num1 = scanner.nextInt();
        System.out.print("Input Integer Number To : ");
        num2 = scanner.nextInt();

        if (num1 < num2) {
            // Type -- 1
            /*for (int i = num1; i <= num2; i++) {
                int count = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0 && i > 0 && i > 1) {
                    sum += i;
                    System.out.print(i + "+");
                }
            }
            System.out.println("\nSum = " + sum);
            */
            
            
            // Type -- 2
            for (int i = num1; i <= num2; i++) {
                if (isPrime(i)) {
                    sum += i;
                    System.out.print(i + " + ");
                }
            }
            
            System.out.println("\nSum = "+sum);
            
            
        }

    }
    
    
    public static boolean isPrime(int num){
        if (num==0 || num==1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
