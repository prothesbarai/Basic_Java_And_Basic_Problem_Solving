package com.mycompany.basicjava.java_oop.static_veriable;
/*
    Static Keyword er kaj holo memory Saving Kora. Jate Memory Kom
    Kharoj Hoy.
    Static keyword Deye Lekha Method or Data Direct Class er sathe
    Add thake. i.e. Static keyword deya lekha Method or Data Access 
    Korte kono Object Create kora lage na . Directly Class name deye then
    (.) Dot Sign Deye Static Keyword er method or Data Access Kora Jay
*/
public class ClassName {
    String name,gender;
    static String university = "Barisal Information Technology College";
    int id;
    double result;
    
    public ClassName(String name,String gender,int id,double result){
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.result = result;
    }
    
    public void setPrinted(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("University : "+university);
        System.out.println("Roll : "+id);
        System.out.println("Result : "+result);
        System.out.println("");
    }
}
