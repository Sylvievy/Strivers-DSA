package org.example;

/*
print the following pattern for a given integer N:
*****
*****
*****
*****
*****
 */

public class Pattern1 {
    public static void nPattern(int n){
        System.out.println("N="+n);
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nPattern(2);
        nPattern(4);
        nPattern(3);
        nPattern(7);

    }
}


