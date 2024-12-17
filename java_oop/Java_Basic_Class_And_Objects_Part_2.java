package com.mycompany.basicjava.java_oop;

import java.util.Scanner;

public class Java_Basic_Class_And_Objects_Part_2 {

    public static void main(String[] args) {
        int numOfTeachers;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number Of Teachers : ");
        numOfTeachers = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\n===========Now Input All Teachers Information============\n");
        try {
            // Declaration and Creation a Teacher Array For Storing Data
            Teacher[] teachers = new Teacher[numOfTeachers];
            // Get Input ===== From User ====
            for (int i = 1; i <= numOfTeachers; i++) {
                System.out.println("Input Info For Teacher No : " + i);
                System.out.print("Your Name : ");
                String names = scanner.nextLine();
                System.out.print("Your Gender : ");
                String gender = scanner.nextLine();
                System.out.print("Your Subject : ");
                String sub = scanner.nextLine();
                System.out.print("Your Age : ");
                int age = scanner.nextInt();
                System.out.print("Your Phone : ");
                int phn = scanner.nextInt();
                System.out.print("Your Join Year : ");
                int year = scanner.nextInt();

                // Storing Data
                teachers[i] = new Teacher(names, gender, sub, age, phn, year);
                System.out.println("\n");
                scanner.nextLine();
            }

            // Now Printed All Teacher Data
            for (int i = 0; i < numOfTeachers; i++) {
                teachers[i].setPrint(i);
            }
        }catch(Exception e){
            System.out.println("Something Wrong.Please Check Your Input");
        }

    }

    // User Define Class
    public static class Teacher {

        String names, gender, sub;
        int age, phn, year;
        // Create an Constractor with Parameter
        // Constractor er name same as Class name and without return Type
        public Teacher(String names, String gender, String sub, int age, int phn, int year) {
            this.names = names;
            this.gender = gender;
            this.sub = sub;
            this.age = age;
            this.phn = phn;
            this.year = year;
        }

        public void setPrint(int num) {
            System.out.println("\n==========The Teachers Number of Positions : " + num + 1 + "==========\n");
            System.out.println("Name : " + names);
            System.out.println("Gender : " + gender);
            System.out.println("Subject : " + sub);
            System.out.println("Age : " + age);
            System.out.println("Phone : " + phn);
            System.out.println("Join Year : " + year);
            System.out.println("\n");
        }
    }

}
