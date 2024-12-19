package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_Valid_Voter_Checker {
    public static void main(String[] args){
        int age;
        System.out.print("Enter Your Age : ");
        Scanner scanner = new Scanner(System.in);
        
        age = scanner.nextInt();
        
        if(age>=18){
            System.out.print("You are Valid Voter !");
        }else{
            System.out.print("Sorry ! Invalid Voter !");
        }
        
    }
}
