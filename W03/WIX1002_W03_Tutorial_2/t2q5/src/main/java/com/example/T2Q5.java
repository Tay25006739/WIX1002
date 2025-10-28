package com.example;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

public class T2Q5
{
    public static void main( String[] args )
    {
        System.out.println(" ");
        // 5a) 
        double amount = 32.5;
        amount += 10;
        System.out.println( "The amount is "+ amount );
        
        // 5b)
        String chapter = "Summary";
        System.out.println(chapter);

        // 5c) 
        int num = 1,num1 ; 
        num++;
        num1 = num;

        // 5d)
        float numm = 3000;
        System.out.printf("%.2f\n",numm);

        // 5e)
        String contact;
        Scanner keyboard = new Scanner(System.in);
        contact = keyboard.nextLine();

    }
}
