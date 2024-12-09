package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Digit_Spelling_program {
    public static void main(String[] args){
        
        
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Single Digit (0-9) : ");
        num = scanner.nextInt();
        
        if(num == 0){
            System.out.print("Spelling is : Zero");
        }else if(num == 1){
            System.out.print("Spelling is : One");
        }else if(num == 2){
            System.out.print("Spelling is : Two");
        }else if(num == 3){
            System.out.print("Spelling is : Three");
        }else if(num == 4){
            System.out.print("Spelling is : Four");
        }else if(num == 5){
            System.out.print("Spelling is : Five");
        }else if(num == 6){
            System.out.print("Spelling is : Six");
        }else if(num == 7){
            System.out.print("Spelling is : Seven");
        }else if(num == 8){
            System.out.print("Spelling is : Eight");
        }else if(num == 9){
            System.out.print("Spelling is : Nine");
        }else{
            System.out.print("Number Is Invalid");
        }
        
    }
}
