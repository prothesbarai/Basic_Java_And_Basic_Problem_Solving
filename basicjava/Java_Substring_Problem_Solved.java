package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Substring_Problem_Solved {
    public static void main(String[] args) {
        int start,end;
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        start = scanner.nextInt();
        end = scanner.nextInt();
        
        String s1 = s.substring(start, end);
        
        System.out.println(s1);
        
    }
}
