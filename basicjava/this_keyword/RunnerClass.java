package com.mycompany.basicjava.this_keyword;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        // Java Array 
        int size;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        scanner.nextLine();
        
        // Array Creation and Declaration
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        
        System.out.println("\n===========================================");
        
        // Print Array
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        
        
        
        
        
    }
}
