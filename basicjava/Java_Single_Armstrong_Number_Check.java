package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Single_Armstrong_Number_Check {
    public static void main(String[] args) {
        /*
            Armstrong Example = 153
            1^3 + 5^3 + 3^3 = 153
        */
        
        int num,sum = 0,temp,store,remainder;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Integer Number : ");
        num = scanner.nextInt();

        temp = num;
        while(temp != 0){
            remainder = temp % 10;
            store = remainder * remainder * remainder;
            sum += store;
            temp = temp / 10;
        }
        
        if(num == sum){
            System.out.println(num+" This is Armstrong Number ");
        }else{
            System.out.println(num+" not Armstrong Number ");
        }
        
    }
}
