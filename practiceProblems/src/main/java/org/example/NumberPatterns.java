package org.example;

public class NumberPatterns {
    public static void numberStaircase(int n){
        System.out.println("Pattern : Number Staircase | N = "+n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }
}
