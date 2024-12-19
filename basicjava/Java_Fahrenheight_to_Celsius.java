package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_Fahrenheight_to_Celsius {
    public static void main(String[] args){
        
        /*  Law = Fahrenheit to Celsius
             C = ((F - 32) * 5/9)
         */
        
        
        double celsius,fahrenheit;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Fahrenheit : ");
        fahrenheit = scanner.nextDouble();
        
        celsius = ((fahrenheit - 32) * 5/9);
        System.out.print("Celsius is : " + celsius + "°C");        
    }
}
