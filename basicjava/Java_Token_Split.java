package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Token_Split {

    public static void main(String[] args) {
        String s, regex;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine().trim();

        if (s.length() > 0) {
            regex = "[^A-Za-z]+";

            String[] tokens = s.split(regex);

            System.out.println(tokens.length);

            for (String i : tokens) {
                System.out.println(i);
            }
        } else {
            System.out.println(0);
        }

    }
}
