package com.mycompany.basicjava;
public class Java_String_In_All_One_Class {
    public static void main(String[] args) {
        String s1 = "prothes",s2 = "Prothes",s3 = "Barai";
        
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
        
        
        // Concat Type two way 1. method 2. + operator
        System.out.println(s2+" "+s3);
        System.out.println(s2.concat(" "+s3));
        
        
        
        // Lowercase to uppercase
        System.out.println(s1.toUpperCase());
        
        // Uppercase to lowercase
        System.out.println(s2.toLowerCase());
        
    }
}