package com.mycompany.basicjava.java_oop.static_veriable;

public class RunFile {

    public static void main(String[] args) {
        // Static Data Access Only ClassName [No Create A Objects File]
        String versity = ClassFile.university;
        System.out.println(versity+"\n"+"\tAll Students Information\n\n");
        
        // Now Declaration an Objects And Create an Objects
        ClassFile classFile1 = new ClassFile("Prothes", "Male", 1923, 3.15);
        classFile1.setPrinted();
        
        ClassFile classFile2 = new ClassFile("Hemel", "Male", 1924, 3.51);
        classFile2.setPrinted();
    }
}
