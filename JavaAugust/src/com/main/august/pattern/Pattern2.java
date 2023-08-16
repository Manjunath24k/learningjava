package com.main.august.pattern;
class line1{
    public void Pattern(){
        System.out.print("*\n**\n***\n****\n");
    }
}
class line4{
    public void pattern(){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }
}
public class Pattern2 {
    public static void main(String args[]){
        line1 code1 = new line1();
        line4 code4 = new line4();
        code1.Pattern();
        code4.pattern();
    }    
}
