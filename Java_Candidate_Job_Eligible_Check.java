package com.mycompany.basicjava;

import java.util.Scanner;

public class Java_Candidate_Job_Eligible_Check {

    /*
        Create How to One Questions : SO pattern Here : 
    
        // Q3 : 
        public static void tryThiredQTerm() {
            System.out.println("Do You Know Android Development in Java? (y/n/Y/N)");
            System.out.print("Answer : ");
            check_msc = scanner.next().charAt(0);
            if (check_msc == 'Y' || check_msc == 'y') {
                getNumber = getNumber + 20;
                tryForthQTerm();
            } else if (check_msc == 'N' || check_msc == 'n') {
                System.out.println("Ok Try Next Questions");
                tryForthQTerm();
                getNumber = getNumber - 20;
            } else {
                System.out.println("Rejected ! Invaild Answer !");
            }
        }
     */
    public static char chk_love, check_bsc, check_msc;
    public static int getNumber = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Job Vaiva");

        System.out.println("Do You Love Java Programming ? (y/n/Y/N)");
        System.out.print("Answer : ");
        chk_love = scanner.next().charAt(0);

        if (chk_love == 'y' || chk_love == 'Y') {
            getNumber = getNumber + 20;
            acceptedFirstTerm();
        } else if (chk_love == 'n' || chk_love == 'N') {
            System.out.println("Ok Try Next Questions");
            acceptedFirstTerm();
        } else {
            System.out.print("Rejected ! Invaild Answer !");
        }

    }

    // Q1 : 
    public static void acceptedFirstTerm() {
        System.out.println("Do You Complete BSC in CSE ? (y/n/Y/N)");
        System.out.print("Answer : ");
        check_bsc = scanner.next().charAt(0);
        if (check_bsc == 'Y' || check_bsc == 'y') {
            getNumber = getNumber + 20;
            trySecondQTerm();
        } else if (check_bsc == 'N' || check_bsc == 'n') {
            System.out.println("Ok Try Next Questions");
            trySecondQTerm();
            getNumber = getNumber - 20;
        } else {
            System.out.print("Rejected ! Invaild Answer !");
        }
    }

    // Q2 : 
    public static void trySecondQTerm() {
        System.out.println("Do You Complete MSC in CSE ? (y/n/Y/N)");
        System.out.print("Answer : ");
        check_msc = scanner.next().charAt(0);
        if (check_msc == 'Y' || check_msc == 'y') {
            getNumber = getNumber + 20;
            finalQuestionTerm();
        } else if (check_msc == 'N' || check_msc == 'n') {
            System.out.println("Ok Try Next Questions");
            finalQuestionTerm();
            getNumber = getNumber - 20;
        } else {
            System.out.println("Rejected ! Invaild Answer !");
        }
    }

    // Q3 : 
    public static void finalQuestionTerm() {
        System.out.println("Do You Know Android Development in Java? (y/n/Y/N)");
        System.out.print("Answer : ");
        check_msc = scanner.next().charAt(0);
        if (check_msc == 'Y' || check_msc == 'y') {
            getNumber = getNumber + 20;
            result();
        } else if (check_msc == 'N' || check_msc == 'n') {
            result();
        } else {
            System.out.println("Rejected ! Invaild Answer !");
        }
    }

    
    public static void result() {
        if (getNumber > 50) {
            System.out.println("Passed ! Successed ! Welcome !");
            System.out.println("Your Result is : " + getNumber);
        } else {
            System.out.println("Try Again Later . Thank You ! ");
            System.out.println("Your Result is : " + getNumber);
        }
    }

}
