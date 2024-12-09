package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Switch_Call_Center {
    public static void main(String[] args){
        
        
        int digit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Digit And Select Language : \n1 for Bengali\n2 for Hindi\n3 for English\n4 for Tamil\nYour Answer : ");
        
        digit = scanner.nextInt();
        
        switch(digit){
            case 1:
                System.out.println("You Selected Item No : "+digit+" So You Like Bengali");
                break;
            case 2:
                System.out.println("You Selected Item No : "+digit+" So You Like Hindi");
                break;
            case 3:
                System.out.println("You Selected Item No : "+digit+" So You Like English");
                break;     
            case 4:
                System.out.println("You Selected Item No : "+digit+" So You Like Tamil");
                break;
            default:
                System.out.println("You Selecte Invalid Number");
        }
        
        
        
    }
}
