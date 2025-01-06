package com.mycompany.basicjava.Variable_Length;
public class RunnerClass {
    public static void main(String[] args) {
        
        
        CustomClass customClass = new CustomClass();
        int result = customClass.add(10,20,30,40,50,60,70,80,90);
        System.out.println("Result : " + result);
        
    }
}
