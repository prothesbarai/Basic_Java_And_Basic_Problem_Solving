package com.mycompany.basicjava;
public class Java_Primitive_To_String_And_String_To_Primitive {
    public static void main(String[] args) {
        
        // Primitive Convert to String
        
        int x = 10;
        float y = 50.5f;
        double z = 100.5674;
        boolean bb = true;
        String s1 = Integer.toString(x);
        String s2 = Float.toString(y);
        String s3 = Double.toString(z);
        String s4 = Boolean.toString(bb);
        
        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
        
        
        
        System.out.println("\n\n");
        // String Convert to Primitive
        String s5 = "32";
        String s6 = "30.67";
        int p1 = Integer.parseInt(s5);
        double p2 = Double.parseDouble(s6);
        System.out.println(p1+"\n"+p2+"\n"+"Now Add Two Value : "+(p1+p2));
        /*
            akhane parseInt() method er pori-borte valueOf() method o use kora jay
        */
        
    }
}
