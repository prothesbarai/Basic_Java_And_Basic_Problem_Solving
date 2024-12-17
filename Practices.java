package com.mycompany.basicjava;
import java.util.Scanner;
public class Practices {
    public static void main(String[] args) {
        int numOfAnimal;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number Of Animal : ");
        numOfAnimal = scanner.nextInt();
        scanner.nextLine();
        
        // Creation And Declaration Of an Array
        Animal[] animals = new Animal[numOfAnimal];
        for (int i = 0; i < numOfAnimal; i++) {
            System.out.print("Animal Name : ");
            String name = scanner.nextLine();
            System.out.print("Animal Weight : ");
            int weight = scanner.nextInt();
            scanner.nextLine();
            
            animals[i] = new Animal(name, weight);
            System.out.println("\n");
        }
        
        for (int i = 0; i < numOfAnimal; i++) {
            animals[i].setPrint();
        }
        
    }
    
    
    // Create User Define Class
    public static class Animal{
        String name;
        int weight;
        public Animal(String name,int weight){
            this.name = name;
            this.weight = weight;
        } 
        public void setPrint(){
            System.out.println("Name : "+name);
            System.out.println("Weight : "+weight);
        }
    }
    
    
    
}
