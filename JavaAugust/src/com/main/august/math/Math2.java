package com.main.august.math;
import java.util.*;
public class Math2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p = sc.nextInt();
        System.out.println("Enter the rate of interest:");
        int r = sc.nextInt();
        System.out.println("Enter the time period:");
        int t = sc.nextInt();
        double si, amt;
        si = (p*r*t)/100.0;
        amt = p+si;
        System.out.println("The total amount is:"+amt);
        System.out.println("The simple interest is:"+si);
    }
    
}
