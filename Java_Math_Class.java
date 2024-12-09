package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Math_Class {
    public static void main(String[] args){
        
        int num1,num2,result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input First Integer Value : ");
        num1 = scanner.nextInt();
        System.out.print("Input Second Integer Value : ");
        num2 = scanner.nextInt();
        
        // Now Some Math Practices ...................
        
        result = Math.max(num1, num2);
        System.out.println("Max Value = "+result);
        
        result = Math.min(num1, num2);
        System.out.println("Min Value = "+result);
        
        result = Math.abs(num1);
        // Absolute Means convert negative to positive Number
        System.out.println("Absolute Value (For Num1)= "+result);
        
        double power = Math.pow(num1, num2);
        System.out.println("Power Value (Num1 Pow of Num2)= "+power);
       
        double square = Math.sqrt(num1);
        System.out.println("Root Value (Root Num1)= "+square);
        
        System.out.println("PI = "+Math.PI);
    }
}
