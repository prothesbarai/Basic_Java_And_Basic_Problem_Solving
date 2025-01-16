package com.mycompany.basicjava.super_keyword;

public class DogClass extends AnimalClass{
    public String name;
    
    public DogClass(String name,String colors, int legs, double weight, boolean wool) {
        super(colors, legs, weight, wool);
        this.name = name;
    }
    
    
    @Override
    public void setPrint(){
        System.out.println("Animal Name : "+name);
        super.setPrint();
    }
    
}
