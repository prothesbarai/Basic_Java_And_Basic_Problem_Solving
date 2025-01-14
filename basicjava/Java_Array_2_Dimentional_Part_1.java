package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_Array_2_Dimentional_Part_1 {
    public static void main(String[] args) {
        int rows,cols;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number of Rows : ");
        rows = scanner.nextInt();
        System.out.print("Number of Cols : ");
        cols = scanner.nextInt();
        scanner.nextLine();
        
        
        // Input Matrix1 or Array 1 
        System.out.println("\nInputMatrix No 1 :");
        int[][] myArray1 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Matrix1 [%d][%d] = ",i,j);
                myArray1[i][j] = scanner.nextInt();
            }
        }
        
        
        // Input Matrix2 or Array 2 
        System.out.println("\nInputMatrix No 2 :");
        int[][] myArray2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Matrix2 [%d][%d] = ",i,j);
                myArray2[i][j] = scanner.nextInt();
            }
        }
        
        
        
        // Output Matrix1 or Array 1
        System.out.println("\n\nOutput Matrix No 1 :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int A = myArray1[i][j];
                System.out.print(" "+A);
            }
            System.out.println();
        }
        
        
        // Output Matrix2 or Array 2
        System.out.println("\nOutput Matrix No 2 :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int B = myArray2[i][j];
                System.out.print(" "+B);
            }
            System.out.println();
        }
        
        
        // The Two Matrix Addition And Print Here
        System.out.println("\nMatrix1 + Matrix2 : ");
        int[][] addMatrix = new int[rows][cols]; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                addMatrix[i][j] = myArray1[i][j] + myArray2[i][j];
                System.out.print(" "+addMatrix[i][j]);
            }
            System.out.println();
        }
        
        
        
        // Any Column Sum
        System.out.print("Sum Number Of Column : ");
        int sumAnyCol = 0,getColumnNum;
        getColumnNum = scanner.nextInt();
        scanner.nextLine();
        
        if (getColumnNum >= 0 || getColumnNum <= cols) {
            for (int i = 0; i < addMatrix.length; i++) {
                sumAnyCol += addMatrix[i][getColumnNum];
            }
        }
        System.out.println("Sum Any Column : " + sumAnyCol);
        
        
        // Any Row Sum
        System.out.print("Sum Number Of Row : ");
        int sumAnyRow = 0,getRowNum;
        getRowNum = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < addMatrix[getRowNum].length; i++) {
            if (getColumnNum >= 0 || getColumnNum <= rows ) {
                sumAnyRow += addMatrix[getRowNum][i];
            }
        }
        System.out.println("Sum Any Column : " + sumAnyRow);
        
        
        
    }
}
