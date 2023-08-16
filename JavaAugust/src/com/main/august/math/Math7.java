package com.main.august.math;
import java.util.*;

public class Math7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c,sum,pr;
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Enter 's' for sum and'p' for product of the three numbers:");
        char ch = sc.next().charAt(0);
        if(ch=='s')
        {
            sum = a+b+c;
            System.out.println("The sum of three numbers are:"+sum);
        }
        else if(ch=='p'){
            pr = a*b*c;
            System.out.println("The product of three numbers are:"+pr);
        }
        else{
            System.out.println("Invalid character");
        }
    }
}
