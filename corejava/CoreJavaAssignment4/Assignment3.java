package com.CoreJavaAssignment4;
import java.util.Locale;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        double accountBalance = 10000;
        System.out.println("Your account Balance is " + accountBalance);
        System.out.println("eneter the amount to withdraw");
        Scanner input = new Scanner(System.in);
        double withdraw = input.nextDouble();
        double accountDuplicate =accountBalance;
        accountDuplicate -=withdraw;
        if (accountBalance >= withdraw) {

            while (accountBalance > withdraw) {
                System.out.println("if you want to withdraw again type yes or type no");
                String choice = input.next();
                if (choice.toUpperCase(Locale.ROOT).matches("YES")) {
                    if (withdraw < 0) {
                        try {
                            throw new IllegalBankTransactionException();
                        } catch (IllegalBankTransactionException e) {
                            System.out.println("You shouldn't enter the negative value " + e);
                        }
                    }
                    accountBalance -= withdraw;
                    System.out.println("yout account Balance is :" + accountBalance);
                    System.out.println("eneter the amount to withdraw");
                    withdraw = input.nextDouble();
                    accountBalance -= withdraw;

                    if (accountBalance < withdraw) {
                        try {

                            throw new InsufficientBalanceEception();
                        } catch (InsufficientBalanceEception e) {
                            System.out.println(e);
                        }
                    }


                } else if (choice.toUpperCase(Locale.ROOT).matches("NO")) {
                    System.out.println("Your account balance is :" + accountDuplicate);
                    break;
                } else
                    System.out.println("Invalid input");


            }
        }
    }


        private static class IllegalBankTransactionException extends Exception {
            public String gerMessage() {
                return "negative value";
            }
        }

                private static class InsufficientBalanceEception extends Exception {
                    public String gerMessage() {
                        return "Insufficient Balance";
                    }
                }
            }


