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
        
        System.out.println("\n===========================================\n\n");
        
        // Print Array
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        
        
        // All Array sum
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("\nSum : "+sum);
        
        
        // Avg In Array
        double avg;
        avg = sum/myArray.length;
        System.out.println("Avg : "+avg);
        
        // Find Max Value In the Array
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (max<myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println("Maximum : "+max);
        
        // Find The Minimum Number in Array
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }
        System.out.println("Minimum : "+min);
        
        
        
    }
}
