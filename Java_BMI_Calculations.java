package com.mycompany.basicjava;
import java.util.Scanner;

public class Java_BMI_Calculations {
    public static void main(String[] args) {
        double weight,height_feet,height_inchi;
        double total_height_inchi,feet_to_inchi;
        double cm_in_height,bmi,height_meter;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Your Weight (Kg) : ");
        weight = scanner.nextDouble();
        
        System.out.print("Your Height (Feet) : ");
        height_feet = scanner.nextDouble();
        
        System.out.print("Your Height (Inchi) : ");
        height_inchi = scanner.nextDouble();
        
        /*  
            1 Feet = 12 inchi
            1 Feet = 30.48 cm
            1 inchi = 2.54 cm
        */
        feet_to_inchi = height_feet * 12;
        total_height_inchi = feet_to_inchi + height_inchi;
        cm_in_height = total_height_inchi * 2.54;
        height_meter = cm_in_height / 100;
        bmi = weight / (height_meter * height_meter);
        
        
        if (bmi>18.5 && bmi<24.9) {
            System.out.println(bmi+" This BMI is Normal");
        }else if(bmi<18.5){
            System.out.println(bmi+" This BMI is Under-Weight");
        }else if(bmi>24.9){
            System.out.println(bmi+" This BMI is Over-Weight");
        }
        
    }
}
