package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Array_1_Dimentional_Part_1 {
    public static void main(String[] args) {
        int num,sum=0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Total Number oF Array or Array Size : ");
        num = scanner.nextInt();
        scanner.nextLine();
        // Array Creation And Declaration
        int[] myArray = new int[num];
       
        // Input Purpose An Array
        for (int i = 0; i < num; i++) {
            myArray[i] = scanner.nextInt();
        }
        
        System.out.println("\n\nArray is : ");
        
        // Print Purpose An Array
        for (int i = 0; i <myArray.length ; i++) {
            System.out.print(myArray[i]+" ");
        }
        
        // Sum Of all Array
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i]; 
        }
        System.out.println("\n\nSum Of Array = "+sum);
        
        
    }
}
