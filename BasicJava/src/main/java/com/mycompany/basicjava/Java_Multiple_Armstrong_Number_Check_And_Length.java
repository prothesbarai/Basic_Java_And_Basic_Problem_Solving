package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Multiple_Armstrong_Number_Check_And_Length {
    public static void main(String[] args) {
        /*
            Armstrong Example = 153
            1^3 + 5^3 + 3^3 = 153
        */
        int num1, num2, count = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input 1st Integer Number : ");
        num1 = scanner.nextInt();
        
        System.out.print("Input 2nd Integer Number : ");
        num2 = scanner.nextInt();

        if (num1<num2) {
            for (int i = num1; i <= num2; i++) {
                if (isArmstrong(i)) {
                    count++;
                    System.out.print(i+" , ");
                }
            }
        }else{
            System.out.println("Must Be, 2nd Number Big than 1st Number"); 
        }
        
        System.out.println("\nTotal Length = "+count);
        
        
    }
    
    public static boolean isArmstrong(int num){
        int remainder,sum = 0,store,temp;
        temp = num;
        while(temp != 0){
            remainder = temp % 10;
            store = remainder * remainder * remainder;
            sum += store;
            temp = temp / 10;
        }
        
        if (num == sum) {
            return true;
        }
        
        return false;
    }
    
}
