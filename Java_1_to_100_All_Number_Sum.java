package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_1_to_100_All_Number_Sum {
    public static void main(String[] args){
        
        int num,sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input The Number : ");
        num = scanner.nextInt();
        
        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        
    }
}
