package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Palindrome_Number_From_M_to_N_And_Length {

    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Integer Number : ");
        num1 = scanner.nextInt();

        System.out.print("Input Integer Number : ");
        num2 = scanner.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if(isPalinDrome(i)){
                    System.out.print(i+" , ");
                }
            }
        }

    }
    
    public static boolean isPalinDrome(int num){
        int temp,remainder,reverse = 0;
        temp = num;
        while(temp != 0){
           remainder = temp % 10;
           reverse = reverse * 10 + remainder;
           temp = temp / 10; 
        }
        if(num == reverse){
            return true;
        }
        return false;
    }
}
