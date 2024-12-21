package com.mycompany.basicjava.box_volumn_problems;
import java.util.Scanner;
public class Box_Volumn {
    public static void main(String[] args) {
        /*  Type -1 Initialize
            // Create a Two Box;
            Box box1 = new Box(10, 10, 10);
            Box box2 = new Box(20, 30, 10);

            box1.displayVol();
            box2.displayVol();
        */
        
        // Type - 2 from User input
        double height,width,depth;
        Scanner scanner = new Scanner(System.in);
 
        // Create an Array and get Input From User
        Box[] boxs = new Box[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Box Height : ");
            height = scanner.nextDouble();
            System.out.print("Box Width : ");
            width = scanner.nextDouble();
            System.out.print("Box Depth : ");
            depth = scanner.nextDouble();
            boxs[i] = new Box(height, width, depth);
            System.out.println("\n");
        }
        
        
        // Now Print 
        for (int i = 0; i < 2; i++) {
            boxs[i].displayVol();
        }
        
        // Compare
        if (boxs[0].isEqual(boxs[1])) {
            System.out.println("The two boxes have the same volume.");
        } else {
            int comparison = boxs[0].compareVol(boxs[1]);
            if (comparison > 0) {
                System.out.println("Box 1 is larger than Box 2.");
            } else {
                System.out.println("Box 2 is larger than Box 1.");
            }
        }
        
        
    }
}
