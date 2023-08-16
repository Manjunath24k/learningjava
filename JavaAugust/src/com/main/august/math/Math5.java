package com.main.august.math;
import java.util.*;

public class Math5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int u,s;
        double v,a;
        System.out.println("Enter the value of initial velocity:");
        u = sc.nextInt();
        System.out.println("Total distance travelled is:");
        s = sc.nextInt();
        System.out.println("Value of acceleration due to gravity:");
        a = sc.nextDouble();
        v = Math.sqrt(Math.pow(u,2)+2*a*s);
        System.out.println("The final velocity is:"+v);  
    }

    
}
