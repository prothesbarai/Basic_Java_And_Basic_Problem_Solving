package com.mycompany.basicjava;
import java.util.Arrays;
import java.util.Scanner;
public class Java_Array_Sorting {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number Of Element : ");
        num = scanner.nextInt();
        scanner.nextLine();
        
        
        // =========== Input An Array ===============
        int[] myArray = new int[num];
        for (int i = 0; i < num; i++) {
            myArray[i] = scanner.nextInt();
        }
        
        System.out.println("\n\nPrint Array : ");
        
        // ============ Print This Array ============
        for (int i = 0; i < num; i++) {
            System.out.print(myArray[i]+" ");
        }
        
        
        
        // Now Sorting Array
        System.out.println("\n\nAssending Order : ");
        Arrays.sort(myArray); // After Sorting Then Desending.. In this similarly String Array
        for (int i = 0; i < num; i++) {
            System.out.print(myArray[i]+" ");
        }
        
        
        System.out.println("\n\nDesending Order : ");
        for (int i = num-1; i >= 0; i--) {
            System.out.print(myArray[i]+" ");
        }
        
    }
}
