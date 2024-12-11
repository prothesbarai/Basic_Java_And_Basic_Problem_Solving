package com.mycompany.basicjava;
public class Practices_Alll {

    public static void main(String[] args) {
        
        int n = 15; // Change this value for different ranges
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        
        
    }
}
