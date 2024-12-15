package com.mycompany.basicjava;
public class Java_String_In_All_One_Class {
    public static void main(String[] args) {
        String s1 = "prothes",s2 = "Prothes";
        
        // Length Of String
        System.out.println("Length s1 = "+s1.length());
        System.out.println("Length s2 = "+s2.length());
        
        
        // Matching String... Only Equal Method
        if (s1.equals(s2)) {
            System.out.println("Equals - T1");
        }else{
            System.out.println("Not Equals - T1");
        }
        
        
        // Matching String...Equal Method With Case Ignore
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equals - T2 (Ignore Case)");
        }else{
            System.out.println("Not Equals - T2");
        }
        
        
        
    }
}
