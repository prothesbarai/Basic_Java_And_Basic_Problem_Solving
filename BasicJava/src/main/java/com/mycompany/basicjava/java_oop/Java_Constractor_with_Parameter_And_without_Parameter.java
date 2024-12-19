package com.mycompany.basicjava.java_oop;
public class Java_Constractor_with_Parameter_And_without_Parameter {
    /*
        Default Constractor means Without Parameter
        And Parametarized Constractor means With Parameter
                            But
        Default Constractor And Parametarized Constractor Jode konotar
        akta o na thake class er majhe then Compilar Automatic akta
        Default COnstractor Create Kore nibe...
    */
    public static void main(String[] args) {
        
        // For Default Constractor
        Student student1 = new Student();
        student1.setSomePrint();
        student1.setAllPrint();
        
        // For some parameter Constractor
        Student student2 = new Student("John Doe", "Male", 121, 30);
        student2.setSomePrint();
        student2.setAllPrint();
        
        // For All parameter Constractor
        Student student3 = new Student("John Doe", "Male", "CSE", "C.Science", 121, 30, 1521229494);
        student3.setAllPrint();
        student3.setSomePrint();
    }
    
    
    /*
        Here Create a User Define Class And With Two Constractor
        Default Constractor and Multi / Single Parametarized
        Uses in This Class . Now Here -
        
        Rules Of Constractor : 
                             1. Same to name as Class name
                             2. Without return type even including void 
                             3. Create many Constractor in one class (But Different Parameter)
                                And its a called constractor overloading......
                             4. But Constractor Find/ terget Based On its Parameter
    */
    public static class Student{
        String name,gender,sub,group;
        int roll,age,phn;
        //Create a Default Constractor Without Parameter
        public Student(){
            System.out.println("Nothing : Default Constractor");
        }
        // Create a Constractor With Some Perameter
        public Student(String name,String gender, int roll,int age){
            this.name = name;
            this.gender = gender;
            this.roll = roll;
            this.age = age;
        }
        // Create a Constractor With All Perameter
        public Student(String name,String gender,String sub,String group,int roll,int age,int phn){
            this.name = name;
            this.gender = gender;
            this.sub = sub;
            this.group = group;
            this.roll = roll;
            this.age = age;
            this.phn = phn;
        }
        // Create a print method for Constractor with some perameter
        public void setSomePrint(){
            System.out.println("==============Some Perameter With Constractor=============");
            System.out.println("Name : "+name);
            System.out.println("Gender : "+gender);
            System.out.println("Roll : "+roll);
            System.out.println("Age : "+age);
            System.out.println("\n");
        }
        // Create a print method for Constractor with All perameter
        public void setAllPrint(){
            System.out.println("==============All Perameter With Constractor=============");
            System.out.println("Name : "+name);
            System.out.println("Gender : "+gender);
            System.out.println("Subject : "+sub);
            System.out.println("Group : "+group);
            System.out.println("Roll : "+roll);
            System.out.println("Age : "+age);
            System.out.println("Phone : "+phn);
            System.out.println("\n");
        }
    }
    
    // ===================== The Class End Here =========================
    
}
