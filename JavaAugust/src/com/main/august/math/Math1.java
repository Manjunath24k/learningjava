package com.main.august.math;

import java.util.*;
public class Math1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int i = sc.nextInt();
        int ar, pr;
        double d = 0.0;
        ar = i*i;
        pr = 4*i;
        d = Math.sqrt(2)*i;
        System.out.println("The area of the Square is:"+ar);
        System.out.println("The perimeter of the Square is:"+pr);
        System.out.println("The square of diagonal is:"+d);
    }
    
}
