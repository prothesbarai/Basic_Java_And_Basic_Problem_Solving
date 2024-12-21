package com.mycompany.basicjava.java_oop.static_veriable;
/*
    1. Static Method Access Korte hole Directly Class name then
       (.) operator deye Method Name [Same as static veriable]
    2. Static Method e this and super keyword use kora jabe na
    3. Static Method Cannot Use Non Static Member / method [ Only Static Call Member / method ]
 */
public class Static_Method_ClassName {
    
    int x;
    static int y ;
    
    // Non-Static Method
    void display1(){
        x = 10;
        display2();
        System.out.println("I'm Non Static Method Display - 1");
    }
    
    
    // Static Method 
    static void display2(){
        // display1();    Cannot Call Non Static Method
        // x = 10;        Cannot Call Non Static Variable / Member
        y = 10;           // Only Call Static Variable
        System.out.println("I'm Static Method Display - 2");
    }
    
    
    static void display3(){
        display2();       // Only Call Static Method 
        System.out.println("I'm Static Method Display - 3");
        System.out.println("Static Value : "+y);
    }
    
    
    
}
