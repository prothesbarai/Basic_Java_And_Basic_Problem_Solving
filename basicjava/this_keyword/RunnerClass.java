package com.mycompany.basicjava.this_keyword;

import java.util.Scanner;

public class RunnerClass {

    public static void main(String[] args) {
        int rows, cols, sum = 0;
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
                System.out.printf("myArray[%d][%d] = ", i, j);
                myArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n\n==================================\n\n");

        System.out.println("Output : \n");
        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        // Sum of all array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += myArray[i][j];
            }
        }
        System.out.println("Sum : " + sum);
        System.out.println();

        // Sum Of Any Comumn Number
        int numberOfCol, sumOfCol = 0;
        numberOfCol = scanner.nextInt();
        scanner.nextLine();

        if (numberOfCol >= 0 && numberOfCol < cols) {
            for (int i = 0; i < myArray.length; i++) {
                sumOfCol += myArray[i][numberOfCol];
            }
            System.out.println("Sum Of " + numberOfCol + " no Of Column is : " + sumOfCol);
        } else {
            System.out.println("Out Of Column Length [ length is : 0 - " + (myArray.length-1) + "]");
        }

        

    }
}
