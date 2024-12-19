package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Series_Part_1 {
    public static void main(String[] args) {
        int num,sum = 0, sum1 = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Integer Number : ");
        num = scanner.nextInt();
        
        // Simple Series.............................
        for(int i = 1; i <= num; i++){
            sum = sum + i;
            if(i<num){
                System.out.print(i+"+");
            }else{
                System.out.print(i);
            }
            
        }
        System.out.print(" = " + sum+"\n\n");
        
        // Distance 2 Series
        for (int j = 2; j <=num; j=j+2) {
            sum1 = sum1 + j;
            if (j<num) {
                System.out.print(j+"+");
            }else{
                System.out.print(j); 
            }
        }
        System.out.print(" = " + sum1+"\n\n");
        
        
    }
}
