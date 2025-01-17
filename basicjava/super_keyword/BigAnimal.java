package com.mycompany.basicjava.super_keyword;

public class BigAnimal extends AnimalClass{
    public BigAnimal(String names,String colors,int legs, double weight, boolean wool) {
        super(names,colors, legs, weight, wool);
    }
   
    
    @Override
    public void setPrint(){
        super.setPrint();
        System.out.println();
    }
    
}
