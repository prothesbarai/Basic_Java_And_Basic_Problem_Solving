package com.mycompany.basicjava.super_keyword;
public class RunnerClass {
    public static void main(String[] args) {
        
        BigAnimal cowClass = new BigAnimal("Cow", "Black-White", 4, 400, true);
        cowClass.setPrint();
        
        BigAnimal goatClass = new BigAnimal("Goat", "Black", 4, 60, true);
        goatClass.setPrint();
        
        BigAnimal henClass = new BigAnimal("Hen", "Black-Red", 2, 2.8, true);
        henClass.setPrint();
        
    }
}
