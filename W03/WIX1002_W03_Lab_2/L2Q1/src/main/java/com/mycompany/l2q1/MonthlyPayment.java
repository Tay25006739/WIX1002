package com.mycompany.l2q1;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of car : RM");
        double p = input.nextDouble();
        System.out.print("Enter the Down payment : RM");
        double d = input.nextDouble();
        System.out.print("Enter the interest rate in (%) : ");
        float r = input.nextFloat();
        System.out.print("Enter the loan duration in year: ");
        float y = input.nextFloat();
        double m = (p-d) * (1+r*y /100) / (y*12);
        System.out.printf("Monthly payment: RM %.2f",m);
    }
}
