package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_While_Loop_Program {
    public static void main(String[] args){
        
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input an Integer Number : ");
        num1 = scanner.nextInt();
        
        while(num1 != 0){
            System.out.println(num1+" While Loop");
            num1 = num1 - 1;
        }
        
        System.out.print("Input an Integer Number : ");
        num2 = scanner.nextInt();
        
        int i = 0;
        while(i<=num2){
            System.out.println(i);
            i++;
        }
        
        
        
    }
}
