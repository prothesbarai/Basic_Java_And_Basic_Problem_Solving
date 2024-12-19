package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Array_1_Dimentional_Part_1 {
    public static void main(String[] args) {
        int num,sum=0,max,min;
        double avg,arrayLength;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Total Number oF Array or Array Size : ");
        num = scanner.nextInt();
        scanner.nextLine();
        // Array Creation And Declaration
        int[] myArray = new int[num];
       
        // Input Purpose An Array
        for (int i = 0; i < num; i++) {
            myArray[i] = scanner.nextInt();
        }
        
        System.out.println("\n\nArray is : ");
        
        // Print Purpose An Array
        for (int i = 0; i <myArray.length ; i++) {
            System.out.print(myArray[i]+" ");
        }
        
        // Sum Of all Array
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i]; 
        }
        System.out.println("\nSum Of Array = "+sum);
        
        // Avearge Array..
        arrayLength = myArray.length;
        avg = sum/arrayLength;
        System.out.println("Avg : "+avg);
        
        // Find the max number in array
        max = myArray[0]; // Let, Initially Index 0 position is big 
        for (int i = 1; i < myArray.length; i++) {
            if (max<myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println("Maximum = "+max);
        
        
        // Find the min number in array
        min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (min>myArray[i]) {
                min = myArray[i];
            }
        }
        System.out.println("Minimum = "+min);
        
        
        
    }
}
