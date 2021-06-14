package org.example;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<1;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String formatted = String.format("%03d", x);
            //Complete this line
            System.out.println("%-15s[%s]\n"+s1+formatted);
        }
        System.out.println("================================");
    }
}

