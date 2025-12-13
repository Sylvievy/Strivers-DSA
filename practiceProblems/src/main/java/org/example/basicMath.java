package org.example;

import java.util.Collections;
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
        int min,max=0;
        min=a<b? a:b;
        max=a>b? a:b;
        while(min!=0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        System.out.println("The GCD of the given two integers "+a+","+b+" is "+max);
    }

    public static boolean armstrong(int n) {
        int originalN = n;
        int sum = 0;

        int k = String.valueOf(n).length();

        while (n > 0) {
            int x = n % 10;
            sum += (int) Math.pow(x, k);
            n /= 10;
        }
        return sum == originalN;
    }

    public static void divisors(int n){
        ArrayList<Integer> divisors=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                divisors.add(i);
                if(i!=n/i) divisors.add(n/i);
            }
        }
        Collections.sort(divisors);
        System.out.println("The divisors of "+n+" are "+ divisors);
    }

    public static void palindrome(int n){
        int given=n;
        String checkNum="";
        while(n>0){
            int x=n%10;
            checkNum+=String.valueOf(x);
            n/=10;
        }
        String result=(checkNum.equals(String.valueOf(given)))?"a Palindrome":"not a Palindrome";
        System.out.println("The given number "+given+" is "+result);
    }



    public static void main(String[] args){
        System.out.print("Enter a number:");
        int x=sc.nextInt();
//        System.out.print("Enter a number:");
//        int y=sc.nextInt();
//        countDigits(x);
//        GCD(x,y);
//        System.out.println(armstrong(x));
//        divisors(x);
        palindrome(x);

    }
}
