package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_Palindrome_String_Check {
    public static void main(String[] args) {
        String getString,reverse,orginal;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Any Integer : ");
        getString = scanner.next();
        orginal = getString;
        
        reverse = new StringBuilder(orginal).reverse().toString();
        
        if(orginal.equals(reverse)){
            System.out.println(orginal+" : This String is Palindrome"); 
        }else{
            System.out.println(orginal+" : This String is Not Palindrome");
        }
        
    }
}
