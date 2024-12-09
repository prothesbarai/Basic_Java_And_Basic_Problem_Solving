package com.mycompany.basicjava;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java_Time_And_DateTimeFormatter {
    public static void main(String[] args) {
        
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time : "+localTime);
        
        // Formated LocalTime Here 
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formatTimes = localTime.format(dateTimeFormat);
        System.out.println("Formated Time : "+formatTimes);
        
    }
}
