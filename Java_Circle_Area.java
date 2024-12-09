package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_Circle_Area {
    public static void main(String[] args){
        double pi = 3.1416,radius,area;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        radius = scanner.nextDouble();
        
        area = pi*radius*radius;
        
        System.out.print("Circle Area is : "+area);
        
    }
}
