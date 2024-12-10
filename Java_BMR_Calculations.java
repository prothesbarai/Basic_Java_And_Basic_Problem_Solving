package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_BMR_Calculations {

    public static int age, height_feet, height_inchi, weight;
    public static double bmr,height_cm,feet_to_inchi,total_inchi;
    public static char boy_girl;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("BMR Calculations !");
        System.out.println("Now First Select An Option : ");
        System.out.println("Boys (BMR) for b/B \nOr\nGirls (BMR) for g/G \nYour Answer : ");
        boy_girl = scanner.next().charAt(0);

        if (boy_girl == 'b' || boy_girl == 'B') {
            System.out.println("You Selected Boys BMR");
            boysBmr();
        } else if (boy_girl == 'g' || boy_girl == 'G') {
            System.out.println("You Selected Girls BMR");
            girlsBmr();
        } else {
            System.out.println("Invalid Input Try Again !");
        }

        
    }
    
    public static void commonInput(){
        System.out.print("Your Age : ");
        age = scanner.nextInt();
        System.out.print("\nYour Weight : ");
        weight = scanner.nextInt();
        System.out.print("\nYour Height (Only Feet) : ");
        height_feet = scanner.nextInt();
        System.out.print("\nYour Height (Only Inchi) : ");
        height_inchi = scanner.nextInt();
        
        feet_to_inchi = height_feet * 12;
        total_inchi = feet_to_inchi + height_inchi;
        height_cm = total_inchi * 2.54;
    }
    
    public static void boysBmr(){
        commonInput();
        bmr = (66 + (13.7 * weight) + (5 * height_cm) - (6.8 * age));
        System.out.println("Your BMR is : " + bmr);
    }
    
    public static void girlsBmr(){
        commonInput();
        bmr = (655 + (9.6 * weight) + (1.8 * height_cm) - (4.7 * age));
        System.out.println("Your BMR is : " + bmr);
    }
    
}
