package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_Triangle_Aria {
    
    public static void main(String[] args){
        double base,height,area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base Input : ");
        base = scanner.nextDouble();
        System.out.print("Enter Height Input : ");
        height = scanner.nextDouble();
        
        area = 0.5*base*height;  // law =  1/2 * Base * Height
        
        System.out.print("Area Of Triangle : "+area);
        
    }
    
}
