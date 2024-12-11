package com.mycompany.basicjava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Practices_Alll {

    public static void main(String[] args) {
        
        int day, month, year;
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Month : ");
        month = scanner.nextInt();
        System.out.print("Day : ");
        day = scanner.nextInt();
        System.out.print("Year : ");
        year = scanner.nextInt();
        
        
        try{
            LocalDate date = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println(dayOfWeek);     
        }catch(Exception e){
            System.out.println("Something Error !");
        }
        
        
    }
}
