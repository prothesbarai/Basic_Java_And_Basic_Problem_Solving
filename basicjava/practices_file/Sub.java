package com.mycompany.basicjava.practices_file;
import java.text.NumberFormat;
import java.util.Locale;


public class Sub {
    double payment;
    public Sub(double payment){
        this.payment = payment;
    }
    
    public String usa(){
        Locale uslocale = Locale.US;
        NumberFormat Usormat = NumberFormat.getCurrencyInstance(uslocale);
        String usaCurency = Usormat.format(payment);
        return usaCurency;
    }
    public String india(){
        Locale inlocale = new Locale("en", "IN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(inlocale);
        String india = numberFormat.format(payment).replace("₹", "Rs.");
        return india;
    }
    public String China(){
        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        String china = chinaFormat.format(payment);
        return china;
    }
    
    
    public void getCurrencyInstance(){
        System.out.println("US: "+usa());
        System.out.println("India: "+india());
        System.out.println("China: "+China());
        System.out.println("\u00A5"); // Prints ￥
    }
}
