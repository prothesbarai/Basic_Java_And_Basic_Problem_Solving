package com.mycompany.basicjava.this_keyword;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        int rows,cols,sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number Of Row : ");
        rows = scanner.nextInt();
        System.out.print("Number Of Column : ");
        cols = scanner.nextInt();
        scanner.nextLine();
        
        // Array Creation And Declaration
        int[][] myArray = new int[rows][cols];
        
        // Input From User
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("myArray[%d][%d] = ",i,j);
                myArray[i][j] = scanner.nextInt();
            }
        }
        
        
        
        System.out.println("\n\n==================================\n\n");
        
        
        
        
        System.out.println("Output : \n");
        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
        
        // Sum of all array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += myArray[i][j];
            }
        }
        System.out.println("Sum : "+sum);
        
        
        
    }
}
