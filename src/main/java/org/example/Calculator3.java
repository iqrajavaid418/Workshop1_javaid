package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your monthly payment amount $");
        double monthlyPayment= input.nextDouble(); //PMT

        System.out.println("Enter expected interest rate %");
        double interestRate=input.nextDouble(); //r

        double intNew=(interestRate/12)/100;

        System.out.println("Enter no. of years to pay out.");
        int noOfYears= input.nextInt(); //t

        double totalPayment=noOfYears*12; //n



        double presentValue=monthlyPayment* ((1-Math.pow(1+intNew,-totalPayment))/intNew);

        double newValue=Math.round(presentValue*100.0)/100.0;

        System.out.println("Present value of annuity is $"+newValue);
    }
}
