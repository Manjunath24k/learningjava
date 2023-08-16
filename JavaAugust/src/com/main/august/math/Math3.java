package com.main.august.math;
import java .util.*;
public class Math3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of students:");
        int n = sc.nextInt();
        System.out.println("Enter the total number of girls:");
        int g = sc.nextInt();
        double pb, pg;
        pg = (double)g/n*100.0;
        pb = 100.0-pg;
        System.out.println("Percentage of girls:"+pg);
        System.out.println("Percentage of boys:"+pb);
    }
    
}
