package com.coreJavaAssignment1;

import java.util.Scanner;

public class assignment7 {
    public static void main(String[] args) {

        int[] number = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int flag =0;

        System.out.println("Enter a number to Search");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == num) {
                System.out.println("Match found at position " +i);
                flag=1;
            }
            }
        if (flag ==0){
            System.out.println("Match not found");

            }


    }
}
