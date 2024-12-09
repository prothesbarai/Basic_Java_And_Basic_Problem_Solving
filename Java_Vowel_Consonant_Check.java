package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Vowel_Consonant_Check {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        char latters,convert_lowercase;
        System.out.print("Please Enter a Letter : ");
        /*
            User Jodi Vull kore akta word day then charAt()
            function only 0 index number latter te nebe
        */
        latters = scanner.next().charAt(0);
        
        convert_lowercase = Character.toLowerCase(latters);
        
        if(convert_lowercase == 'a'){
            System.out.print(latters+" is Vowel");
        }else if(convert_lowercase == 'e'){
           System.out.print(latters+" is Vowel");
        }else if(convert_lowercase == 'i'){
           System.out.print(latters+" is Vowel"); 
        }else if(convert_lowercase == 'o'){
           System.out.print(latters+" is Vowel"); 
        }else if(convert_lowercase == 'u'){
           System.out.print(latters+" is Vowel"); 
        }else{
            System.out.print(latters+" is Consonant");
        }
        
        
        
    }
}
