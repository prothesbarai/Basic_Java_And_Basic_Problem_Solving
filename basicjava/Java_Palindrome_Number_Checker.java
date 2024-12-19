package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Palindrome_Number_Checker {
    public static void main(String[] args) {
        int num, reverse = 0, remainder, temp;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Integer Number : ");
        num = scanner.nextInt();
        
        temp = num;
        
        while(temp != 0){
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        
        if (reverse == num) {
            System.out.println(num + " is a Palindrome Number");
        }else{
            System.out.println(num + " Not a Palindrome Number");
        }
        
    }
}
