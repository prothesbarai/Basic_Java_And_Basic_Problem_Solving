package com.mycompany.basicjava.this_keyword;

import java.util.Scanner;

public class RunnerClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num Of Rows : ");
        int rows = scanner.nextInt();
        System.out.print("Num Of Cols : ");
        int cols = scanner.nextInt();
        scanner.nextLine();
        // Creation and Declaration An two dimentional Array
        int[][] myArray = new int[rows][cols];
        // Input in two dimentional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("\nmyArray[%d][%d] = ",i,j);
                myArray[i][j] = scanner.nextInt();
            }
        }
        // Output in Two dimentional array
        System.out.println("\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        //Sum Of All Items in This Array
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += myArray[i][j];
            }
        }
        System.out.println("\nSum Of All Values : "+sum);
        // Sum Of All values Diagonally
        int sumOfDiagonal = 0, sumOfUpperTriangle = 0, sumOfLowerTriangle = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i==j) {
                    sumOfDiagonal += myArray[i][j];
                }
                if (i<j) {
                    sumOfUpperTriangle += myArray[i][j];
                }
                if (i>j) {
                    sumOfLowerTriangle += myArray[i][j];
                }
            }
        }
        System.out.println("\nSum Diagonal : "+sumOfDiagonal);
        System.out.println("Sum Of Upper Triangle : "+sumOfUpperTriangle);
        System.out.println("Sum Of Lower Triangle : "+sumOfLowerTriangle);
        
    }
}
