package com.main.august.math;
import java.util.*;
public class Math4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of days:");
        int d = sc.nextInt();
        int y = d/365;
        int b = d%365;
        int m = b/30;
        int c = b%30;
        int w = c/7;
        int dy = c%7;
        System.out.println("The no of years is:"+y);
        System.out.println("The no of monthes is:"+m);
        System.out.println("The no of weeks is:"+w);
        System.out.println("The no of days is:"+dy);
    }
    
}
