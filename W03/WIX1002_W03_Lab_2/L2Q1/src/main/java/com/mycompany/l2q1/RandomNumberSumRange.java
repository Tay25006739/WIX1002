package com.mycompany.l2q1;

import java.util.Random;

public class RandomNumberSumRange {
    public static void main(String[]args) { 
        Random rd = new Random();
        int rdnum = rd.nextInt(10000);
        System.out.printf("Random number generated: %d \n ", rdnum);
        
        int temp = rdnum;
        int total = 0;
        while (temp > 0) {
            total += temp % 10;
            temp /= 10;
            System.out.println(temp);
        }
        System.out.println("Total: "+ total);

    }

}
