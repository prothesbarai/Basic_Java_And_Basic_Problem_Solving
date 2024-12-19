package com.mycompany.basicjava.java_oop;
public class Java_Basic_Class_And_Objects_Part_1 {
    
    public static void main(String[] args) {
        
        // Now Object Declaration and creation 

        
        Teacher teacher1 = new Teacher();
        teacher1.name = "Shreyasi";
        teacher1.gender = "Female";
        teacher1.age = 24;
        teacher1.phone = 1521229494;
        teacher1.displayInfo();
       
        Teacher teacher3 = new Teacher();
        teacher3.name = "Prothes";
        teacher3.gender = "Male";
        teacher3.age = 26;
        teacher3.phone = 1317818826;
        teacher3.displayInfo();
        
        Teacher teacher2 = new Teacher();
        teacher2.name = "Angkan";
        teacher2.gender = "Male";
        teacher2.age = 17;
        teacher2.phone = 1771705891;
        teacher2.displayInfo();
    }
    
    
    // User Define Class ... 
    /*
        Ata essa korle alada java file e o kora jay
    */
    public static class Teacher{
        String name,gender;
        int age,phone;
        // Create a method
        void displayInfo(){
            System.out.println("Name : "+name);
            System.out.println("Gender : "+gender);
            System.out.println("Age : "+age);
            System.out.println("Phone : "+phone);
            System.out.println("\n");
        }
    }
    
}
