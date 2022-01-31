package com.CoreJavaAssignment4;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2= input.nextInt();
        try {
            int divisionResult = (num1/num2);
            System.out.println(divisionResult);
        }
        catch (ArithmeticException e){
            System.out.println("" + e);
        }
        System.out.println("Line after exception");
    }
}