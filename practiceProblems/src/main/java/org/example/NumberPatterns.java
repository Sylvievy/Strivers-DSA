package org.example;

public class NumberPatterns {
    /*
    1
    12
    123
    1234
    12345
     */
    public static void numberStaircase(int n){
        System.out.println("Pattern : Number Staircase | N = "+n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }

    /*
    1
    22
    333
    4444
    55555
     */
    public static void numStepStaircase(int n){
        System.out.println("Pattern : Number Step Staircase | N = "+n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void invertedRightNumberPyramid(int n){
        System.out.println("Pattern : Inverted Right Number Pyramid  | N = "+n);
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
