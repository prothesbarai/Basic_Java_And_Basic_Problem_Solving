package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Check_A_Single_Prime_Number {

    public static void main(String[] args) {
        int num,count=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Integer Number : ");
        num = scanner.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num+" Not a Prime Number");
        } else {
            for (int i = 2; i < num; i++) {
                if (num%i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(num+" Prime Number");
            }else{
                System.out.println(num+" Not Prime Number");
            }
        }

    }
}
