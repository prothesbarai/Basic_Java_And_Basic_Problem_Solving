package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_FizzBuzz_Multiple_3_And_5_And_Single {
    /*
        • If i is a multiple of both 3 and 5, print FizzBuzz. 
        • If i is a multiple of 3 (but not 5), print Fizz.
        • If i is a multiple of 5 (but not 3), print Buzz.
        • If i is not a multiple of 3 or 5, print the value of i.
    */
    
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Any Integer Number : ");
        num = scanner.nextInt();
        
        
        for (int i = 1; i <= num; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        
    }
}
