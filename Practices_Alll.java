package com.mycompany.basicjava;

public class Practices_Alll {

    public static void main(String[] args) {
        
      // Class Declaration and Creation
      Teacher teacher = new Teacher();
      teacher.names = "Prothes Barai";
      teacher.sub = "ICT";
      teacher.age = 25;
      teacher.year = 2025;
      teacher.displaying();
      
      
      Teacher teacher1 = new Teacher();
      teacher1.names = "Angkan Barai";
      teacher1.sub = "Acounting";
      teacher1.age = 18;
      teacher1.year = 2025;
      teacher1.displaying();
        
        
        
        
    }
    
    // Create a User Define Class
    public static class Teacher{
        String names,sub;
        int age,year;
        void displaying(){
            System.out.println("Name : "+names);
            System.out.println("Subject : "+sub);
            System.out.println("Age : "+age);
            System.out.println("Year : "+year);
            System.out.println("\n");
        }
    }
    
}
