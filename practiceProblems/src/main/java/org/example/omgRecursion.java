package org.example;

public class omgRecursion {

    public static String myName(int n){
        if(n==1){
            return "This is Haru. Roger. Sylvie.";
        }
        return "This is Sylvie. Do you copy?\n" + myName(n-1);
    }

    public static void countdown(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }

    public static void rangeNtoOne(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        rangeNtoOne(n-1);
    }

    public static void rangeOnetoN(int n){
        if(n==0) return;
        rangeOnetoN(n-1);
        System.out.println(n);
    }

    public static void nSum(int n){
        int x=0;
        if(n<0){
            return;
        }
            x+=n;
            nSum(n-1);

        System.out.println(x);

    }
    public static void main(String[] args){
//        System.out.println(myName(5));
//        countdown(5);
//        rangeNtoOne(5);
//        rangeOnetoN(5);
        nSum(5);
    }

}
