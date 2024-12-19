package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Maximum_Number {
    
    
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Three Number Input Here : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        
        if(a<b){
            if(c<b){
                System.out.print(b+" is Big");
            }else{
                System.out.print(c+" is Big");
            }
        }else if(b<c){
            if(a<c){
                System.out.print(c+" is Big");
            }else{
                System.out.print(a+" is Big");
            }
        }
        
        
        
    }
    
    
}
