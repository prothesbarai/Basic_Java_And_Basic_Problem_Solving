package com.mycompany.basicjava.practices_file;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        
        Sub sub = new Sub(num);
        sub.getCurrencyInstance();
        
    }
}
