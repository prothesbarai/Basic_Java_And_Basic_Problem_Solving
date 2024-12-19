package com.mycompany.basicjava.java_oop.static_veriable;

public class RunFile {

    public static void main(String[] args) {
        // Static Data Access Only ClassName [No Create A Objects File]
        String versity = ClassName.university;
        System.out.println(versity+"\n"+"\tAll Students Information\n\n");
        
        // Now Declaration an Objects And Create an Objects
        ClassName classFile1 = new ClassName("Prothes", "Male", 1923, 3.15);
        classFile1.setPrinted();
        
        ClassName classFile2 = new ClassName("Hemel", "Male", 1924, 3.51);
        classFile2.setPrinted();
    }
}
