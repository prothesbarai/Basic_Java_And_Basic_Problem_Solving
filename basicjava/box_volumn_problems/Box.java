package com.mycompany.basicjava.box_volumn_problems;
public class Box {
    // Instance or Global Variable
    double height,width,depth;
    // Create a Constractor
    public Box(double height,double width,double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public double calculateVol(){
        double result = height * width * depth;
        return result;
    }
    // Create Display
    public void displayVol(){
        System.out.println("Result is : "+calculateVol());
    }
    
    public boolean isEqual(Box other) {
        if (this.calculateVol() == other.calculateVol()) {
            return true;
        }
        return false;
    }
    
    public int compareVol(Box other){
        /*
            Compare volumes using the Double.compare() method.
            Returns 0 if equal, otherwise return 1 
            Positive number if current box is larger,
            Negative number if other box is larger.
        */
        return Double.compare(this.calculateVol(), other.calculateVol());
    }
    
}
