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
                System.out.printf("myArray[%d][%d] = ",i,j);
                myArray[i][j] = scanner.nextInt();
            }
        }
        // Output in Two dimentional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(myArray[i][j]+" ");
            }
        }
        
    }
}
