package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_Array_1_Dimentional_Part_2 {
    public static void main(String[] args) {
        int num;
        String[] weekdays = {"Days : ","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Number (1-7) : ");
        num = scanner.nextInt();
        
        
        if (num>0 && num<=7) {
            String nameOfDay = weekdays[num];
            System.out.println(nameOfDay);
        }else{
            System.out.println("Invalid Input");
        }
        
       
        
    }
}
