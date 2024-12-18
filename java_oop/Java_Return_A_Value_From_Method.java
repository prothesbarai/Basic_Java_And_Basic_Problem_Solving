package com.mycompany.basicjava.java_oop;
import java.util.Scanner;
public class Java_Return_A_Value_From_Method {
    public static void main(String[] args) {
        int num,phnNumerCheck,voter_age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input An Number : ");
        num = scanner.nextInt();
        
        System.out.print("Input An Country Phone Number Code : ");
        phnNumerCheck = scanner.nextInt();
        String phnNumber = Integer.toString(phnNumerCheck);
        
        System.out.print("Input Your Age : ");
        voter_age = scanner.nextInt();

        Mymath mymath = new Mymath();
        
        // For Int Return Type
        int result1 = mymath.Square(num);
        System.out.println(num+" : Square Result is : "+result1);
        
        // For String Return Type
        String result2 = mymath.CheckPhnNumber(phnNumber);
        System.out.println(phnNumber+" : This Number Codes of Country Name is : "+result2);
        
        // For Boolean Return Type
        boolean result3 = mymath.isTrue(voter_age);
        if (result3) {
            System.out.println("Your age is : "+voter_age+" So you are eligible for vote.");
        }else{
            System.out.println("Your age is : "+voter_age+" You are not eligible for vote.");
        }
    }
    
    
    // Create User Define Class
    public static class Mymath{
        
        // Integer Return Type same as float and Double
        public int Square(int num){
            int x;
            x = num*num;
            return x;
        }
        
        
        // String Return Type
        public String CheckPhnNumber(String countryCode){
            String result;
            if(countryCode.contains("1")){
                result = "United States";
            }else if(countryCode.contains("91")){
                result = "India";
            }else if(countryCode.contains("44")){
                result = "United Kingdom";
            }else if(countryCode.contains("55")){
                result = "Brazil";
            }else if(countryCode.contains("880")){
                result = "Bangladesh";
            }else{
                result = "Now i am Small Method, I Dont Know the Code";
            }
            return result;
        }
        
        
        // Boolean Return Type
        public boolean isTrue(int age){
            if (age>=18) {
                return true;
            }
            return false;
        }
        
        
        
        
        
    }
    
}
