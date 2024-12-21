package com.mycompany.basicjava.practices_file;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int age,numOfItems;
        String fname,lname;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number Of Item : ");
        numOfItems = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("University : "+Sub.university+"\n\n\n\n");
        
        // ========== Array ==========
        Sub[] subs = new Sub[numOfItems];
        
        for (int i = 0; i < numOfItems; i++) {
            System.out.print("First Name : ");
            fname = scanner.nextLine();
            
            System.out.print("Age : ");
            age = scanner.nextInt();
            
            scanner.nextLine();
            Sub sub = new Sub(fname, age);
            subs[i] = sub;
        }
        
        System.out.println("\n\n");
        
        for (int i = 0; i < numOfItems; i++) {
            subs[i].setPrintOne(i);
        }
        
        
        
        // ================== Array ==================
        Sub[] subs1 = new Sub[numOfItems];
        for (int i = 0; i < numOfItems; i++) {
            System.out.print("First Name : ");
            fname = scanner.nextLine();
            
            System.out.print("Last Name : ");
            lname = scanner.nextLine();
            
            System.out.print("Age : ");
            age = scanner.nextInt();
            
            scanner.nextLine();
            Sub sub = new Sub(fname, lname, age);
            subs1[i] = sub;
        }
        
        System.out.println("\n\n\n");
        
        for (int i = 0; i < numOfItems; i++) {
            subs1[i].setPrintTwo(i);
        }
        
        
        
        
        
    }
}
