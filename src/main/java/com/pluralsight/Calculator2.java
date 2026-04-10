package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("--Welcome to CD calculator--\n");

        System.out.print("What is your Principal deposit: ");
        double p = scan.nextDouble();

        System.out.print("Enter the interest rate: ");
        double r = scan.nextDouble() / 100;

        System.out.print("Enter amount of years: ");
        int t = scan.nextInt();

        //FV = P × (1 + (r / 365))^(365 × t)
        double futureValue = p * Math.pow(1 + (r/365),(365 * t));
        double earnedInterest = futureValue - p;
        System.out.printf("The future value: $%2f \n You would have earned $%.2f in interest", futureValue, earnedInterest);



    }
}
