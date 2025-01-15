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
                System.out.printf("\nmyArray[%d][%d] = ", i, j);
                myArray[i][j] = scanner.nextInt();
            }
        }
        // Output in Two dimentional array
        System.out.println("\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray[i][j] + " ");
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
        System.out.println("\nSum Of All Values : " + sum);
        // Sum Of All values Diagonally
        int sumOfDiagonal = 0, sumOfUpperTriangle = 0, sumOfLowerTriangle = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    sumOfDiagonal += myArray[i][j];
                }
                if (i < j) {
                    sumOfUpperTriangle += myArray[i][j];
                }
                if (i > j) {
                    sumOfLowerTriangle += myArray[i][j];
                }
            }
        }
        System.out.println("Sum Diagonal : " + sumOfDiagonal);
        System.out.println("Sum Of Upper Triangle : " + sumOfUpperTriangle);
        System.out.println("Sum Of Lower Triangle : " + sumOfLowerTriangle);
        // Sum An Any Rows
        int numOfRow, sumOfRow = 0;
        System.out.print("You Sum Number Of Row : ");
        numOfRow = scanner.nextInt();
        scanner.nextLine();
        if (numOfRow >= 0 && numOfRow < rows) {
            for (int i = 0; i < myArray[numOfRow].length; i++) {
                sumOfRow += myArray[numOfRow][i];
            }
            System.out.println("Sum Of " + numOfRow + " number Of Row is : " + sumOfRow);
        }else{
            System.out.println("The row out of range");
        }
        // Sum An Any Columns
        int numOfCols,sumOfCols = 0;
        System.out.print("You Sum Number Of Cols : ");
        numOfCols = scanner.nextInt();
        scanner.nextLine();
        if (numOfCols >= 0 && numOfCols < cols) {
            for (int i = 0; i < myArray[numOfCols].length; i++) {
                sumOfCols += myArray[i][numOfCols];
            }
            System.out.println("Sum Of "+numOfCols + " number of cols is  : "+sumOfCols);
        }else{
            System.out.println("The Cols out of range");
        }
        // Now again input other an Two Dimentional array
        // again creation and declaration an array here
        int[][] myArray2 = new int[rows][cols];
        // Only input And Col and Row Previous Collected
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("\nmyArray2[%d][%d] = ",i,j);
                myArray2[i][j] = scanner.nextInt();
            }
        }
        // Output This array
        System.out.println("\n\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray2[i][j]+" ");
            }
            System.out.println();
        }
        
        
        // Now Add Two Array here
        System.out.println("\n\n");
        int[][] addArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                addArray[i][j] = myArray[i][j] + myArray2[i][j];
                System.out.print(addArray[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
