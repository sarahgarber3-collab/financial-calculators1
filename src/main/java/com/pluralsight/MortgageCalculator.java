package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.println("--Welcome to the Mortgage Calculator!--");
        System.out.println("--Let's figure out your monthly payment and interest!--");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the principal: ");
        double p = scan.nextDouble();

        System.out.print("Please enter the interest rate: ");
        double r = scan.nextDouble() / 100;

        System.out.print("Please enter the loan length: ");
        int loanLength = scan.nextInt();

        double i = r / 12;
        double n = 12 * loanLength;

        //M = P × (i * (1 + i)^n / ( (1 + i)^n ) - 1)
        double m = p * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);


        double totalInterest = (m*n) - p;

        System.out.printf("$%.2f/mo payment with a total interest of $%.2f", m, totalInterest);
    }
}
