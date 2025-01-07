package com.mycompany.basicjava.practices_file;

import java.util.ArrayList;

public class Students {
    public String names,group,sub,gender;
    public int id,year,age;
    public long roll;
    public double gpa;
    public double[] gradePoints;
   
    
    public Students(String names,String gender,int age,String group,String sub,long roll,int id,int year,double gpa){
        this.names = names;
        this.gender = gender;
        this.age = age;
        this.group = group;
        this.sub = sub;
        this.roll = roll;
        this.id = id;
        this.year = year;
        this.gpa = gpa;
    }
    
    public Students(double ... gradePoints){
        this.gradePoints = gradePoints;
    }
    
    
    public double calculateGpa(){
        double sum = 0,result,creditHours = 3.0,temp,totalCreditHours ;
        ArrayList<Double> arrayList = new ArrayList();
        for(double i : gradePoints) {
            temp = i * creditHours;
            arrayList.add(temp);
        }
        for (double i : arrayList) {
            sum += i;
        }
        
        totalCreditHours = 3.0 * arrayList.size();
        result = sum / totalCreditHours;
        
        return result;
    }
    
    
    public void setPrinted(){
        System.out.println("Name : "+names);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("Group : "+group);
        System.out.println("Subject : "+sub);
        System.out.println("Roll : "+roll);
        System.out.println("ID : "+id);
        System.out.println("Year : "+year);
        System.out.println("GPA : " + gpa);

    }
    
}
