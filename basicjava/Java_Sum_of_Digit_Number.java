package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Sum_of_Digit_Number {
    public static void main(String[] args) {
        int num,sum = 0,remainder,temp;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input An Integer Number : ");
        num = scanner.nextInt();
        
        temp = num;
        
        while(temp != 0){
            remainder = temp % 10;
            sum += remainder;
            temp = temp/10;
        }
        System.out.println("Sum = "+sum);
        
    }
}
