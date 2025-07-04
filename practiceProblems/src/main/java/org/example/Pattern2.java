package org.example;

/*
Given an integer N, print the following pattern :
*
**
***
****
*****
 */

public class Pattern2 {
    public static void rightTrianglePattern(int n){
        System.out.println("N="+n);

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        rightTrianglePattern(4);
        rightTrianglePattern(6);
        rightTrianglePattern(2);
        rightTrianglePattern(8);





    }
}
