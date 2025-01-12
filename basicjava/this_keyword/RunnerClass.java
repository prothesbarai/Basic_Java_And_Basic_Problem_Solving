package com.mycompany.basicjava.this_keyword;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        // Java Array 
        int col,row,num;
        Scanner scanner = new Scanner(System.in);
        //col = scanner.nextInt();
        //row = scanner.nextInt();
        num = scanner.nextInt();
        scanner.nextLine();
        
        String[] myArray = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
        
        
        String getData = myArray[num];
        System.out.println("Day is : "+getData);
        
        
        
    }
}
