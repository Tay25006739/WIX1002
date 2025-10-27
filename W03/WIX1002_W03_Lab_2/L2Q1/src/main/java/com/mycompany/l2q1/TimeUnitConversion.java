package com.mycompany.l2q1;

import java.util.Scanner;

public class TimeUnitConversion {
    public static void main(String[]args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = input.nextInt();
        int hour = sec/3600;
        int minutes = (sec - hour*3600)/60;
        int seconds = sec- (hour * 3600) - (minutes * 60);
        System.out.printf("\n   %d seconds is %d hours, %d minutes and %d seconds", sec, hour, minutes, seconds);
        
    }
}
