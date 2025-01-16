package com.mycompany.basicjava.super_keyword;

public class DogClass extends AnimalClass{
    
    public DogClass(String names,String colors, int legs, double weight, boolean wool) {
        super(names,colors, legs, weight, wool);
    }
    
    
    @Override
    public void setPrint(){
        super.setPrint();
    }
    
}
