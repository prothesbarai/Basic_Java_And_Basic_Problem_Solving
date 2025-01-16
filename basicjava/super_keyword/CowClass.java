package com.mycompany.basicjava.super_keyword;

public class CowClass extends AnimalClass{
    
    public String names;
    public CowClass(String names,String colors, int legs, double weight, boolean wool) {
        super(colors, legs, weight, wool);
        this.names = names;
    }
   
    
    double getMeetCow = weight * 0.55;
    
    
    @Override
    public void setPrint(){
        System.out.println("The Animal Name is : "+names);
        super.setPrint();
        System.out.println("The "+names+" Amount of get Meets is : "+getMeetCow);
    }
    
}
