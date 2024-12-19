package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_If_If_Else_And_Else {
    public static void main(String[] args){
        int num;
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        if(num>0){
            System.out.print("Number is Positive");
        }else if(num<0){
            System.out.print("Number is Negative");
        }else{
            System.out.print("Number is Zero");
        }
    }
}
