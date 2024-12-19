package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Conditional_Or_Turnary_Operator {
    
    public static void main(String[] args){
        /*
        Formula : 
            Condition ? Expression1 : Expression2
            Condition True Hole Expression1 Print Hobe
            Condition False Hole Expression2 Print Hobe 
        */
        // Example Here : 
        
        int num1,num2,output;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input First Integer Number : ");
        num1 = scanner.nextInt();
        System.out.print("Input Second Integer Number : ");
        num2 = scanner.nextInt();
        
        output = (num1>num2) ? num1 : num2;
        
        System.out.print("The Big Value is : "+output);
        
        
        
        
        
        
        
        
    }
    
}
