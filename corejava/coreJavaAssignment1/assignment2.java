package com.coreJavaAssignment1;


public class assignment2 {
    public static void main(String[] args) {



        for (int i = 152; i <= 999; i++) {
            int num2 = i;
            int sum = 0;
            while (num2 > 0) {

                int lastDigit = num2 % 10;
                sum = sum + (lastDigit * lastDigit * lastDigit);
                num2 = num2 / 10;

            }
            if (sum == i)
                System.out.println("Entered number " + i + " is a Armstrong number");


        }
    }
}
