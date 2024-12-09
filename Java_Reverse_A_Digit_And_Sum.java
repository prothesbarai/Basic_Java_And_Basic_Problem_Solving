package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_Reverse_A_Digit_And_Sum {
    public static void main(String[] args) {
        int num,remainder,reverse =  0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input An Integer Number : ");
        num = scanner.nextInt();
        
        while(num !=0){
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        
        System.out.println(num+" : Reverse Value is : "+reverse);
        
    }
}
