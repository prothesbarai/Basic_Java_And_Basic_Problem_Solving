package com.mycompany.basicjava.practices_file;
public class RunnerFile {
    public static void main(String[] args) {

        Students student_marks = new Students(5,5,4,5,3.17);
        double gpa = student_marks.calculateGpa();
        Students students = new Students("Prothes", "Male", 25,"Science", "CSE", 18502002591L, 1923, 2025,gpa);
        students.setPrinted();
        
        OthersClass othersClass = new OthersClass(10, "Navy Blue");
        othersClass.setPrinted();
        
    }
}
