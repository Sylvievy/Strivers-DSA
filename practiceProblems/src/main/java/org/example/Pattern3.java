package org.example;

public class Pattern3 {
    public static void numberStaircase(int n){
        System.out.println("N="+n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }

    public static void main(String[] args){
        numberStaircase(3);
        numberStaircase(6);
        numberStaircase(9);
    }
}
