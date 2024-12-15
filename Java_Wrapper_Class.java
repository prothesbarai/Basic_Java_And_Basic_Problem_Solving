package com.mycompany.basicjava;
public class Java_Wrapper_Class {
    public static void main(String[] args) {
        
        // Autoboxing : means primitive to objects..
        int x = 10;
        Integer x1 = Integer.valueOf(x);
        System.out.println("Autoboxing : "+x1);
        // again
        Integer x2 = x1;
        System.out.println("Autoboxing : "+x2);
        
        
        
        // Unboxing : means objects to primitive..
        Character ch1 = new Character('P');
        char ch2 = ch1.charValue();
        System.out.println("Unboxing : "+ch2);
        
    }
}
