package com.mycompany.basicjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Practices_Alll {
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println(date);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String sd = dateFormat.format(date);
        System.out.println(sd);
        
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String ff = localTime.format(dateTimeFormatter);
        System.out.println(ff);
        
        
    }
}
