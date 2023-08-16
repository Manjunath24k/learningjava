package com.main.august.math;
import java.util.*;
public class Math6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sq,cb;
        if(a!=b){
            if(a<b){
                sq = a*a;
                cb = b*b*b;
            }
            else{
                sq = b*b;
                cb = a*a*a;
            }
            System.out.println("The square of the number is:"+sq);
            System.out.println("The cube of the number is:"+cb);
        }
        else{
            System.out.println("The entered numbers are equal");
        }
    }
    
    
}
