package com.mycompany.basicjava.practices_file;
public class Pro {
    public static void main(String[] args) {
        
        Shreyasi shreyasi = new Shreyasi("Shreyasi", 23, 3.50);
        shreyasi.setOutput(2);
        
        
        Shreyasi shreyasi2 = new Shreyasi("Prothes", 23);
        shreyasi2.setOutput(3);
        
        int x1 = shreyasi.add(10, 10);
        System.out.println("Add : "+x1);
        
        double x2 = shreyasi.add(10.55, 10.77);
        System.out.println("Add : "+x2);
        
    }
}
