package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_String_Regex_Clear_Concept {
    public static void main(String[] args) {
        String getString1,regex1,regex2,regex3,regex4,regex5,regex6,regex7,regex8,regex9;
        Scanner scanner = new Scanner(System.in);
        
        /* ==== Define Regex Formula ==== */
     
        
        System.out.print("Input For Regex1 : (a..b) : ");
        getString1 = scanner.nextLine();
        

        // Type 1 :  "a.c" → "arc" or "a..c" → "arrc", or "a...c" → "arrrc"
        regex1 = "a..b"; // First a Last b but middle only 2 another
        
        if (getString1.matches(regex1)) {
            System.out.println("Match Regex 1 : formula : a..b");
        }else{
            System.out.println("No Match. soln: First a middle only 2 another and last b");
        }
        
        
        
        // Type 2 :  "^abc" [ ^ Used to match the beginning of the string ]
        regex2 = "^abc"; // Must Be abc or Only abc.. without no match
        System.out.print("\nInput For Regex2 : ^abc : ");
        String getString2 = scanner.nextLine();
        if (getString2.matches(regex2)) {
            System.out.println("Match Regex 2 : formula : ^abc");
        }else{
            System.out.println("No Match. soln: Only Match, abc");
        }
        
        
        
        // Type 3 :  "^abc.*" [ ^ means must be abc (first) and . means anything and * means reapeted 0 or many times immediate previous ]
        regex3 = "^abc.*"; // First must be start abc but ends anythings
        System.out.print("\nInput For Regex3 : ^abc.* : ");
        String getString3 = scanner.nextLine();
        if (getString3.matches(regex3)) {
            System.out.println("Match Regex 3 : formula : ^abc.*");
        }else{
            System.out.println("No Match. soln: First abc and last anything");
        }
        
        
        // Type 4 :  ".*abc$" [ $ means must be abc (last) and . means anything and * means reapeted 0 or many times immediate previous ]
        regex4 = ".*abc$"; // First anything but last must be abc
        System.out.print("\nInput For Regex4 : .*abc$ : ");
        String getString4 = scanner.nextLine();
        if (getString4.matches(regex4)) {
            System.out.println("Match Regex 4 : formula : .*abc$");
        }else{
            System.out.println("No Match. soln: First anything But last abc");
        }
        
        
        
        // Type 5 :  ".*abc.*" [. means anything and * means reapeted 0 or many times immediate previous ]
        regex5 = ".*abc.*"; // Anywhere must be abc
        System.out.print("\nInput For Regex5 : .*abc.* : ");
        String getString5 = scanner.nextLine();
        if (getString5.matches(regex5)) {
            System.out.println("Match Regex 5 : formula : .*abc.*");
        }else{
            System.out.println("No Match. soln: Anywhere must be abc");
        }
        
        
    }
}
