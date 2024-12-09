package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_For_Loop_Program {
    
    public static void main(String[] args){
        
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an Integer Number : ");
        num1 = scanner.nextInt();
        
        for(int i=1; i<=num1; i++){
            System.out.println(i+" Prothes Barai");
        }
        
        System.out.print("Input an Integer Number : ");
        num2 = scanner.nextInt();
        
        
        for(int i=1; i<=num2; i++){
            System.out.println(i);
        }
        
    }
    
}
