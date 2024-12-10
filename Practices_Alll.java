package com.mycompany.basicjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Practices_Alll {
    public static void main(String[] args) {
 
        
        
       Date date = new Date();
       
       DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
       String s = dateFormat.format(date);
       System.out.println(s);
         
       LocalTime localTime = LocalTime.now();
       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
       String s1 = localTime.format(dateTimeFormatter);
        System.out.println(s1);
    }
}
