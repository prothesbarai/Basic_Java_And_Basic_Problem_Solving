package com.mycompany.basicjava.java_oop.static_veriable;
public class Static_Method_RunFile {
    public static void main(String[] args) {
        
        // Non Static Method Access for Create a Objects
        Static_Method_ClassName obj1 = new Static_Method_ClassName();
        obj1.display1();
        
        // Static Method Access Directly By Class name
        Static_Method_ClassName.display2();
        Static_Method_ClassName.display3();
    }
}
