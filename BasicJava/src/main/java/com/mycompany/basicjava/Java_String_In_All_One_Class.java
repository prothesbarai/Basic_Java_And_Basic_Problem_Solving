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
        
        
        // Start With Alphabet Check
        boolean output1 = s2.startsWith("P");
        System.out.println("Start Value P Check in s2 : "+output1);
        
        
        // End With Alphabet Check
        boolean output2 = s2.endsWith("s");
        System.out.println("End Value s Check in s2 : "+output2);
        
        
        // String Reverse
        String reverse;
        reverse = new StringBuilder(s1).reverse().toString();
        System.out.println("Reverse s1 : "+reverse);
        
        
        // String er First And Last Space revome korar jonno : trim()
        String myString = "    Bangladesh is  my  Country    ";
        System.out.println(myString);
        String stringTrim = myString.trim();
        System.out.println(stringTrim);
        
        
        
        // Replace Any String using replace()
        String myName = "Amp prothem & Amp mhreyami";
        System.out.println("Before Replace : "+myName);
        String myNm = myName.replace("m", "s");
        System.out.println("After Replace : "+myNm);
        
        
        // Split() means Cut Base on any String or space
        String myS1 = "This is a beautiful country";
        String myS2 = "This_is_a_beautiful country";
        String[] splitText1 = myS1.split(" "); // Divide based on space
        String[] splitText2 = myS2.split("_"); // Divide based on Underscore
        // Using For Each Loops
        for (String x : splitText1) {
            System.out.println(x);
        }
        // Using For Each Loops
        for (String y : splitText2) {
            System.out.println(y);
        }
        
        
        
        
        
        // StringBuffer  Start Here ===================
        System.out.println("\n==================String Buffer====================");
        /*
            String vs StringBuffer in main difference is that
            String in one variable is not dynamically change value
            But StringBuffer is Dynamically Change Value
        */
        
        StringBuffer buffer = new StringBuffer();
        buffer.append("Prothes");
        buffer.append(" Barai");
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        buffer.delete(0, 2); // 0 index to before 2 index delete the letter
        System.out.println(buffer);
        buffer.deleteCharAt(0); // Only 0 Number index delete 
        System.out.println(buffer);
        // StringBuffer  End Here ===================
        
        
        
        
        // StringBuilder  Start Here ===================
        /*
            Same to as String Buffer
        */
        System.out.println("\n==================String Builder====================");
        String sp = "Prothes";
        
        StringBuilder builder = new StringBuilder();
        builder.append(sp);
        builder.append(" Barai");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        builder.delete(0, 2); // 0 index to before 2 index delete the letter
        System.out.println(builder);
        builder.deleteCharAt(0); // Only 0 Number index delete 
        System.out.println(builder);
        builder.replace(0, 5, "a"); // 0 - 5 replace and by one character a 
        System.out.println(builder);
        
    }
}
