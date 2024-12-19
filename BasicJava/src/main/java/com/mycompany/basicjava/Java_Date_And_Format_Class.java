package com.mycompany.basicjava;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java_Date_And_Format_Class {
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println("Date : "+date);
        
        // But Format Style - 1
        DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/YYYY");
        String formateDate = dateFormat1.format(date);
        System.out.println("Formated Date S-1 : "+formateDate);
        
        // But Format Style - 2
        DateFormat dateFormat2 = new SimpleDateFormat("dd-MM-YYYY");
        String formateDate1 = dateFormat2.format(date);
        System.out.println("Formated Date S-2 : "+formateDate1);
        
        
        // But Format Style - 3
        DateFormat dateFormat3 = new SimpleDateFormat("dd.MM.YYYY");
        String formateDate2 = dateFormat3.format(date);
        System.out.println("Formated Date S-3 : "+formateDate2);
        
    }
}
