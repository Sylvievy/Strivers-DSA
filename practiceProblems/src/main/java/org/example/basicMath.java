package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class basicMath {
    static Scanner sc=new Scanner(System.in);
    public static void countDigits(int n){
        String num= String.valueOf(n);
        System.out.println("The length of the given number :"+num.length());
        String reverseNum="";
        for(int i=num.length()-1;i>=0;i--){
            reverseNum+=num.charAt(i);
        }
        System.out.println("The reversal of the given number :"+reverseNum);
    }

    public static void GCD(int a, int b){
        int min=0;
        int GCD=0;

        if(a>b){
            min=b;
        }else{
            min=a;
        }
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                if(i>GCD){
                    GCD=i;
                }
            }
        }
        System.out.println("The GCD of the given two integers "+a+" "+b+" is "+GCD);
    }

    public static boolean armstrong(int n){
        String num=String.valueOf(n);
        int x=0;
        int numLen=num.length();
        for(int i=1;i<numLen;i++){
            x=(int)num.charAt(i)*numLen;
        }
        if(x==n){
            return true;
        }
        return false;
    }

    public static void divisors(int n){
        ArrayList<Integer> divisors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                divisors.add(i);
            }
        }
        System.out.println("The divisors of "+n+" are "+divisors);
    }

    public static void main(String[] args){
        System.out.print("Enter a number:");
        int x=sc.nextInt();
//        System.out.print("Enter a number:");
//        int y=sc.nextInt();
//        countDigits(x);
//        GCD(x,y);
        System.out.println(armstrong(x));
        divisors(x);

    }
}
