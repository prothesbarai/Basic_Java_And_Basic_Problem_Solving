package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Uppercase_And_Lowercase_Check {
    public static void main(String[] args){
        
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a latter Check Lowercase Or Uppercase : ");
        ch = scanner.next().charAt(0);
        
        if(ch>='A' && ch<='Z'){
            System.out.print(ch+" is Uppercase");
        }else if(ch>='a' && ch<='z'){
            System.out.print(ch+" is Lowercase");
        }else{
            System.out.print(ch+" not a latter");
        }
        
    }
}
