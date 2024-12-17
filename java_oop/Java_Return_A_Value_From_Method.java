package com.mycompany.basicjava.java_oop;
import java.util.Scanner;
public class Java_Return_A_Value_From_Method {
    public static void main(String[] args) {
        int num,phnNumerCheck;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input An Number : ");
        num = scanner.nextInt();
        
        System.out.print("Input An Country Phone Number Code : ");
        phnNumerCheck = scanner.nextInt();
        String phnNumber = Integer.toString(phnNumerCheck);

        Mymath mymath = new Mymath();
        
        int result1 = mymath.Square(num);
        System.out.println(num+" : Square Result is : "+result1);
        String result2 = mymath.CheckPhnNumber(phnNumber);
        System.out.println(phnNumber+" : This Number Codes of Country Name is : "+result2);
        
    }
    
    
    // Create User Define Class
    public static class Mymath{
        
        public int Square(int num){
            int x;
            x = num*num;
            return x;
        }
        
        public String CheckPhnNumber(String countryCode){
            String result = "";
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
        
        
        
    }
    
}
