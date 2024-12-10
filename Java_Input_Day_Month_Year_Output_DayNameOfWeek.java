package com.mycompany.basicjava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Java_Input_Day_Month_Year_Output_DayNameOfWeek {

    public static void main(String[] args) {
        int day, month, year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Day : ");
        day = scanner.nextInt();
        System.out.print("Month : ");
        month = scanner.nextInt();
        System.out.print("Year : ");
        year = scanner.nextInt();

        try {
            LocalDate date = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("Day : "+dayOfWeek);
        }catch(Exception e){
            System.out.println("Invalid Date Please Check");
        }

    }
}
