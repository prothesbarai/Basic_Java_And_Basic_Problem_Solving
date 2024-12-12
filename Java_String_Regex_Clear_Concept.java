package com.mycompany.basicjava;
import java.util.Scanner;
public class Java_String_Regex_Clear_Concept {
    public static void main(String[] args) {
        String regex1,regex2,regex3,regex4,regex5,regex6,regex7,regex8,regex9;
        String regex10,regex11,regex12;
        Scanner scanner = new Scanner(System.in);
        
        /* ==== Define Regex Formula ==== */
     
        
        // Type 1 :  "a.c" → "arc" or "a..c" → "arrc", or "a...c" → "arrrc"
        regex1 = "a..b"; // First a Last b but middle only 2 another
        System.out.print("Input For Regex1 : (a..b) : ");
        String getString1 = scanner.nextLine();
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
        
        
        // Type 6 :  "[abc]" [ Any character within the string can be matched a , b or c ]
        regex6 = "[abc]"; // only one character match at the same time .. only one input
        System.out.print("\nInput For Regex6 : [abc] : ");
        String getString6 = scanner.nextLine();
        if (getString6.matches(regex6)) {
            System.out.println("Match Regex 6 : formula : [abc]");
        }else{
            System.out.println("No Match. soln: a or b or c character in one Input");
        }
        
        
        // Type 7 :  "[^abc]" [ Without a,b or c match any Character ]
        regex7 = "[^abc]"; // without abc input any single character
        System.out.print("\nInput For Regex7 : [^abc] : ");
        String getString7 = scanner.nextLine();
        if (getString7.matches(regex7)) {
            System.out.println("Match Regex 7 : formula : [^abc]");
        }else{
            System.out.println("No Match. soln: Without a,b or c match any single character");
        }
        
        
        // Type 8 :  "[0-9]" [ 0 to 9 any single value match ]
        regex8 = "[0-9]"; // Only Single value match
        System.out.print("\nInput For Regex8 : [0-9] : ");
        String getString8 = scanner.nextLine();
        if (getString8.matches(regex8)) {
            System.out.println("Match Regex 8 : formula : [0-9]");
        }else{
            System.out.println("No Match. soln: Only Value Match 0 to 9 Single Value");
        }
        
        
        // Type 9 :  "[a-z]" [ a to z any single Character match ]
                            // Same as [A-Z] for Capital Letter
        regex9 = "[a-z]"; // Only Single Character match
        System.out.print("\nInput For Regex9 : [a-z] : ");
        String getString9 = scanner.nextLine();
        if (getString9.matches(regex9)) {
            System.out.println("Match Regex 9 : formula : [a-z]");
        }else{
            System.out.println("No Match. soln: a to z any single Character match");
        }
        
        
        // Type 10 :  "^[a-z].*" [ Must be first Character Small a-z end anything] 
                               // Same To for "^[A-Z].*"  first Character Capital A-Z end anything
        regex10 = "^[a-z].*"; // First Character always smallar letter 
        System.out.print("\nInput For Regex10 : ^[a-z].* : ");
        String getString10 = scanner.nextLine();
        if (getString10.matches(regex10)) {
            System.out.println("Match Regex 10 : formula : ^[a-z].*");
        }else{
            System.out.println("No Match. soln: First Character always smallar letter");
        }
        
        
        
        // Type 11 :  "^[a-zA-Z].*" [First Character must be Character End Anythings] 
        regex11 = "^[a-zA-Z].*"; // First Character always letter  
        System.out.print("\nInput For Regex11 : ^[a-zA-Z].* : ");
        String getString11 = scanner.nextLine();
        if (getString11.matches(regex11)) {
            System.out.println("Match Regex 11 : formula : ^[a-zA-Z].*");
        }else{
            System.out.println("No Match. soln: First Character always letter");
        }
        
        
        // Type 12 :  "^[a-zA-Z][a-zA-Z0-9_]*$" [First Character must be Letter End only a-z,A-Z,0-9 and _ ] 
        regex12 = "^[a-zA-Z][a-zA-Z0-9_]*$"; // Always First is Character end is a,A,9,_  
        System.out.print("\nInput For Regex12 : ^[a-zA-Z][a-zA-Z0-9_]*$ : ");
        String getString12 = scanner.nextLine();
        if (getString12.matches(regex12)) {
            System.out.println("Match Regex 12 : formula : ^[a-zA-Z][a-zA-Z0-9_]*$");
        }else{
            System.out.println("No Match. soln: Always First is Character end is a,A,9,_");
        }
        
        
        
        
        
    }
}
