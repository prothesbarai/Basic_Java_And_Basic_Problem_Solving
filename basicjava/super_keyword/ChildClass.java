package com.mycompany.basicjava.super_keyword;
public class ChildClass extends ParentClass{

    public int x = 5;
    
    public void display(){
        System.out.println("Child Class : " + x);
        // Access Parent Class Variable
        System.out.println("Super Class : " + super.x);
        System.out.println(super.y);
    }
    
}
