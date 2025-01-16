package com.mycompany.basicjava.super_keyword;
public class AnimalClass{
    public String colors;
    public int legs;
    public double weight;
    public boolean wool;
    
    public AnimalClass(String colors,int legs,double weight,boolean wool){
        this.colors = colors;
        this.legs = legs;
        this.weight = weight;
        this.wool = wool;
    }
    
    public void wools(){
        if (wool == true) {
            System.out.println("This Animal Have Wools");
        }else{
            System.out.println("This Animal Have No Wools");
        }
    }
    
    
    
    public void GoatMeetWeight(){
        double getMeetGoat = weight * 0.5;
    }
    public void HenMeetWeight(){
        double getMeetHen = weight * 0.7;
    }
    
    public void setPrint(){
        System.out.println("Animal Color is : "+colors);
        System.out.println("This Animal is : "+legs+" Legs");
        System.out.println("And Weight is : "+weight);
        wools();
    }
    
}
