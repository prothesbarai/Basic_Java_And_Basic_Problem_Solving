package com.mycompany.basicjava.practices_file;
public class Shreyasi{
    String nam;
    int x;
    double gpa;
    
    public Shreyasi(String nam,int x, double gpa){
        this.nam = nam;
        this.x = x;
        this.gpa = gpa;
    }
    
    public Shreyasi(String nam,int x){
        this.nam = nam;
        this.x = x;
    }
    
    int add(int a, int b){
       return a+b; 
    }
    
    double add(double a, double b){
        return a+b;
    }
    
    public void setOutput(int nums){
        int r;
        r = x + nums;
        System.out.println("Name : "+nam);
        System.out.println("Age : "+r);
        System.out.println("GPA : "+gpa);
    }
    
}
