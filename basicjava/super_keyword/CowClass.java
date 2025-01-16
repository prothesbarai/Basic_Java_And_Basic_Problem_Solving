package com.mycompany.basicjava.super_keyword;

public class CowClass extends AnimalClass{
    
    public CowClass(String names,String colors, int legs, double weight, boolean wool) {
        super(names,colors, legs, weight, wool);
    }
   
    
    double getMeetCow = weight * 0.55;
    
    
    @Override
    public void setPrint(){
        super.setPrint();
        System.out.println("The "+names+" Amount of get Meets is : "+getMeetCow);
    }
    
}
