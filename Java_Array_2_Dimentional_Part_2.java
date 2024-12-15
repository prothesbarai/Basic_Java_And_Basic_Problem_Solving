package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_Array_2_Dimentional_Part_2 {
    public static void main(String[] args) {
        int rows,cols;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number Of Rows : ");
        rows = scanner.nextInt();
        System.out.print("Number Of Cols : ");
        cols = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        
        // An create an matrix and declear with store values : Input Matrix
        int[][] myMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("myMatrix [%d][%d] : ",i,j);
                myMatrix[i][j] = scanner.nextInt();
            }
        }
        
       
        System.out.println("\n\nMatrix Output : ");
        
        // Show Output Here : Matrix Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = myMatrix[i][j];
                System.out.print(" "+x);
            }
            System.out.println();
        }
        
        
        System.out.println("\n\nSum Of Diagonal, Upper & Lower Triangle Matrix : ");
        int sumOfDiagonal = 0,sumOfUpper = 0,sumOfLower = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                // Diagonal Triangle Means row_index == col_index number
                if (i==j) {
                    sumOfDiagonal = sumOfDiagonal + myMatrix[i][j];
                }
                
                // Upper Triangle Means row_index < col_index number
                if (i<j) {
                    sumOfUpper = sumOfUpper + myMatrix[i][j];
                }
                
                // Lower Triangle Means row_index > col_index number
                if (i>j) {
                    sumOfLower = sumOfLower + myMatrix[i][j];
                }
                
            }
        }
        
        
        System.out.println("Sum Of Diagonal Triangle = "+sumOfDiagonal);
        System.out.println("Sum Of Upper Triangle = "+sumOfUpper);
        System.out.println("Sum Of Lower Triangle = "+sumOfLower);
        
        
        
    }
}
