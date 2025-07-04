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
    public static void hypotenusePattern(int n){
        System.out.println("N="+n);

        for (int i=1;i<n+1;i++){
            for (int j=1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        hypotenusePattern(4);
        hypotenusePattern(6);
        hypotenusePattern(2);
        hypotenusePattern(8);





    }
}
