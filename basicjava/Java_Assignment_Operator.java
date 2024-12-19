package com.mycompany.basicjava;
public class Java_Assignment_Operator {
    
    
    public static void main(String[] args){
        int a=10, b=20, c=30;
        
        int x = a + b;
        
        b += a; // b = b + a;
        a -=a;  // a = a - a;
        c *= b; // c = c * b;
        
        
        
        System.out.print(x+"\n"+b+"\n"+a+"\n"+c);
        
    }
    
    
}
