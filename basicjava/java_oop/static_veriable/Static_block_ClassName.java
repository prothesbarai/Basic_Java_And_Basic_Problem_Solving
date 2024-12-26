package com.mycompany.basicjava.java_oop.static_veriable;
public class Static_block_ClassName {
    static String name;
    static int roll;
    static String university,subjects;
    
    // Create Here Static Block
    static{
        university = "Barisal Information Technology College";
        subjects = "CSE";
        System.out.println("\nPreviously Print Static Block Then Print Main Method\n");
    }
    public Static_block_ClassName(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("University : "+university);
        System.out.println("Subject : "+subjects);
        System.out.println("\n");
    }
}
