/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2q1;

/**
 *
 * @author Tay
 */
import java.util.Scanner;

public class DCToFah {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double celcius = (Fahrenheit - 32) /1.8;
        System.out.printf("Temperature in Degree Celcius: %.2f Degree Celcius", celcius);
    }
}
