package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter total amount of the loan.");//p
        double p=scan.nextDouble();

        System.out.println("what's your interest rate % ? "); //r
        double interestBefore=scan.nextDouble();

        double r=(interestBefore/100)/12;



        System.out.println("Enter your loan length."); //y
        int y= scan.nextInt();


        double payment=p*(r*Math.pow(1+r,12*y))/ (Math.pow(1+r,12*y)-1);
        double finalOutput=Math.round(payment*100.0)/100.0;

        System.out.println("Your monthly payment is $ "+finalOutput+ "/month");

        double totalInterest = finalOutput*(12*y)-p;
        double finalInterest=Math.round(totalInterest*100.0)/100.0;
        System.out.println("Your total interest is $"+finalInterest);




    }
}
