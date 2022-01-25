package com.coreJavaAssignment1;

import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        System.out.println("Enter the 3 marks");
        Scanner input = new Scanner(System.in);
        int mark1 = input.nextInt();
        int mark2 = input.nextInt();
        int mark3 = input.nextInt();
        if (mark1 > 60 && mark2 > 60 && mark3 > 60) {
            System.out.println("hey you passed the exam");
        }

        else if((mark1 > 60 && mark2 > 60) || (mark2 > 60 && mark3 > 60) || (mark3 > 60 && mark1 > 60)) {
            System.out.println("Promoted");
        }


        else
        {
            System.out.println("failed");

        }
    }
}
