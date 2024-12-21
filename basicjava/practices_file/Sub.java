package com.mycompany.basicjava.practices_file;

public class Sub {
    static String university = "MIST";
    String fname,lname;
    int age;
    
    public Sub(String fname, int age){
        this.fname = fname;
        this.age = age;
    }
    
    public Sub(String fname,String lname,int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    
    public void setPrintOne(int num){
        System.out.println("Item No : "+num);
        System.out.println("First Name : "+fname);
        System.out.println("University : "+university);
        System.out.println("Age : "+age);
        System.out.println("");
    }
    
    public void setPrintTwo(int num){
        System.out.println("Item No : "+num);
        System.out.println("Name : "+fname+" "+lname);
        System.out.println("Age : "+age);
        System.out.println("University : "+university);
        System.out.println("");
    }
    
}
