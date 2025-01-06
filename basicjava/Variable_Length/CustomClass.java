package com.mycompany.basicjava.Variable_Length;

public class CustomClass{
    public int add(int ... num){
        int sum = 0;
        for(int i : num){
            sum = sum + i;
        }
        return sum;
    }
}
