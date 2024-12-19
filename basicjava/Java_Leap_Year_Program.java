package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Leap_Year_Program {
   public static void main(String[] args){
       
       int year;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a Year : ");
       
       year = scanner.nextInt();
       
       if((year%4 == 0 && year%100 != 0) || year%400 == 0){
           System.out.print("This "+year+" Year is Leap Year");
       }else{
           System.out.print("This "+year+" Year is not Leap Year");
       }
       
   }
}
