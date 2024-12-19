package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Celsius_to_Fahrenheit {

    public static void main(String[] args) {

        /*  Law = Celsius to Fahrenheit
             F = ((9/5* C)+32)
         */
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celsius : ");
        celsius = scanner.nextDouble();

        fahrenheit = 1.8 * celsius + 32;
        System.out.print("Fahrenheit is : "+fahrenheit+"°F");
        
    }
}
