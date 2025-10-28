package com.example;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

public class T2Q7 
{
    public static void main( String[] args )
    {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in inch:");
        double inch = input.nextDouble();
        double meters = inch * 2.54 /1000;
        System.out.printf("%.2f inches = %.2f meters", inch, meters );

    }
}
