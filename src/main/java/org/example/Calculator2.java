package org.example;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner user =new Scanner(System.in);

        System.out.println("Enter deposit amount $ ?"); //p
        double deposit=user.nextDouble();

        System.out.println("What is your interest rate % ? ");//r
        double interest=user.nextDouble();
        double newInt=interest/100;

        System.out.println("Enter no. of years ?");//t
        int noYears= user.nextInt();
        int yearsNew=noYears*365;

        double FV=deposit*Math.pow(1+(newInt/365),yearsNew);
        double FVoutput=Math.round(FV*100.0)/100.0;

        System.out.println("The future value willbe $"+FVoutput);


        double totalInterest=(FVoutput-deposit);
        double totalInt=Math.round(totalInterest*100.0)/100.0;
        System.out.println("Total interest earned willbe $"+totalInt);





    }
}
