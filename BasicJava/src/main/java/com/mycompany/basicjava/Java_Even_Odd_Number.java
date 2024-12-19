package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Even_Odd_Number {
    public static void main(String[] agrs){
        
        int num;
        System.out.print("Please Enter The Number : ");
        Scanner scanner = new Scanner(System.in);
        
        num = scanner.nextInt();
        
        if(num%2 == 0){
            System.out.print(num + " : this number is Even");
        }else{
            System.out.print(num + " : this number is Odd");
        }
        
        
    }
}
