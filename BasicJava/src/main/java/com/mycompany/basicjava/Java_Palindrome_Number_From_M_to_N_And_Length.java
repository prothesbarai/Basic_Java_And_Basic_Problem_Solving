package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Palindrome_Number_From_M_to_N_And_Length {

    public static void main(String[] args) {
        int num1, num2, count = 0 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 1st Integer Number : ");
        num1 = scanner.nextInt();

        System.out.print("Input 2nd Integer Number : ");
        num2 = scanner.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if(isPalinDrome(i)){
                    System.out.print(i+" , ");
                    count++;
                }
            }
        }else{
            System.out.println("Must Be 2nd Value big than 1st Value");
        }
        
        System.out.println("\nTotal Palindrome Number is : "+count);
        

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
