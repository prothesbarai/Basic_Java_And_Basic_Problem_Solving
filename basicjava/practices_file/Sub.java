package com.mycompany.basicjava.practices_file;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


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
        //String india = numberFormat.format(payment).replace("₹", "Rs.");
        String india = "Rs." +numberFormat.format(payment).substring(1);
        return india;
    }
    public String China(){
        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        String china = chinaFormat.format(payment);
        return china;
    }
    
    public String France(){
        Locale franceLocale = Locale.FRANCE;
        NumberFormat fnumberFormat = NumberFormat.getCurrencyInstance(franceLocale);
        String france = fnumberFormat.format(payment);
        return france;
    }
    
    
    public void getCurrencyInstance(){
        System.out.println("US: "+usa());
        System.out.println("India: "+india());
        System.out.println("China: "+China());
        System.out.println("France: "+France());
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        
        Sub sub = new Sub(num);
        sub.getCurrencyInstance();
        
    }
}
