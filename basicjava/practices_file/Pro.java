package com.mycompany.basicjava.practices_file;

import java.util.Scanner;

public class Pro {
    public static void main(String[] args) {
        
        int num,sum=0,max,min;
        Scanner scanner = new Scanner(System.in);
        // Input Array Size
        num = scanner.nextInt();
        scanner.nextLine();
        
        // Array Creation And Declaration
        int[] myArray = new int[num];
        // Input An Array
        for (int i = 0; i < num; i++) {
            myArray[i] = scanner.nextInt();
        }
        
        System.out.println("\n\n\n");
        // Output
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(""+myArray[i]);
        }
        // Sum Of Array
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("Sum : "+sum);
        // Max
        max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println("Max : "+max);
        
        // Minimum Number
        min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }
        System.out.println("Min : "+min);
        
        // Avg
        double avg;
        avg = sum/myArray.length;
        System.out.println("Avg : "+avg);
        
        
        
        
    }
}
