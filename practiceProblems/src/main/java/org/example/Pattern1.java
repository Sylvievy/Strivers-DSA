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
    public static void BlockPattern(int n){
        System.out.println("N="+n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BlockPattern(2);
        BlockPattern(4);
        BlockPattern(3);
        BlockPattern(7);

    }
}


