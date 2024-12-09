package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Break_And_Continue {
    public static void main(String[] args){
        
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        
        // For Break Statement
        System.out.print("Input a Integer Number : ");
        num1 = scanner.nextInt();
         /*
            Loop Theke Ber Hobar Jonno break
            Statement Use Kora Hoy....
            But loop er maje break statement kaj kore
            akta condition er upor base kore...
        */
         
         for(int i=1; i<=num1; i++){
             /* i er value jokhon 6 hobe tokhon loop
                theke ber hoye jabe and ai loop off hobe
             */
             if(i==6){
                 break;
             }
             System.out.println(i);
         }
         
         
         
         
         
        // For Continue Statement 
        System.out.print("Input a Integer Number : ");
        num2 = scanner.nextInt();
        /*
            Loop or any place e kono value skip korar jonno
            continue Statement Use Kora Hoy....
            But continue statement o kaj kore
            akta condition er upor base kore...
        
            Note : continue means Skip Condition Value
        */
        
        
        for(int i=1; i<=num2; i++){
             /* i er value jokhon 6 hobe then only 6 
                number position skip hobe 
             */
             if(i==6){
                 continue;
             }
             System.out.println(i);
         }
        
    }
}
