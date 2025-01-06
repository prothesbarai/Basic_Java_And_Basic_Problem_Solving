package com.mycompany.basicjava.practices_file;

import java.util.Scanner;

public class Pro {
    public static void main(String[] args) {
        
        int a,b,c;
        String x;
        Scanner scanner = new Scanner(System.in);
        
        x = scanner.nextLine();
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        
        c = a+b;
        
        System.out.println("Name : "+x+"\n"+"Age is : "+c);
        
    }
}
