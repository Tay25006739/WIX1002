package com.example;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

public class T2Q6
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");

        System.out.print("Enter diameter: ");
        double diameter = input.nextDouble();
        double ccf = Math.PI * diameter;
        System.out.printf( "The circumference of circle is : %.3f", ccf);
    }
}
