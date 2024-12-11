package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_Reverse_String {
    public static void main(String[] args) {
        String getString,reverse;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Any String : ");
        getString = scanner.next();
        
        // Reverse String in One Line Command
        reverse = new StringBuilder(getString).reverse().toString();
        System.out.println("Reverse String : "+reverse);
        
        
    }
}
