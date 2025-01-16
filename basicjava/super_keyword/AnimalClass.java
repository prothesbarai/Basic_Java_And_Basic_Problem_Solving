package com.mycompany.basicjava.super_keyword;
public class AnimalClass{
    public String names;
    public String colors;
    public int legs;
    public double weight;
    public boolean wool;
    
    public AnimalClass(String names,String colors,int legs,double weight,boolean wool){
        this.names = names;
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
    
    public void getMeetWeight(){
        if (names.contains("cow") || names.contains("Cow")) {
            double getMeetCow = weight * 0.55;
            System.out.println("The "+names+" Amount of get Meets is : "+getMeetCow);
        }
        if (names.contains("Goat") || names.contains("goat")) {
            double getMeetGoat = weight * 0.5;
            System.out.println("The "+names+" Amount of get Meets is : "+getMeetGoat);
        }
        if (names.contains("Hen") || names.contains("hen")) {
            double getMeetHen = weight * 0.7;
            System.out.println("The "+names+" Amount of get Meets is : "+getMeetHen);
        }
    }
    
    
    
    public void setPrint(){
        System.out.println("Animal Name is : "+names);
        System.out.println("Animal Color is : "+colors);
        System.out.println("This Animal is : "+legs+" Legs");
        System.out.println("And Weight is : "+weight);
        wools();
        getMeetWeight();
        System.out.println();
    }
    
}
