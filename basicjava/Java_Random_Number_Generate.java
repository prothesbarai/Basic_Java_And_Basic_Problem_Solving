package com.mycompany.basicjava;

import java.util.Random;

public class Java_Random_Number_Generate {

    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(51) + 50; // 50 - 100
        /* 
            int randomNumber = random.nextInt(10); // 0 - 9
            int randomNumber = random.nextInt(100) + 1; // 1 - 100
            int randomNumber = random.nextInt(91) + 10; // 10 - 100
            int randomNumber = random.nextInt(51) + 50; // 50 - 100
         */

        System.out.println("Random Number : " + randomNumber);
    }
}
