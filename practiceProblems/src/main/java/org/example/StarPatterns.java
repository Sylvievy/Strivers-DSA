package org.example;

    /*
    print the following pattern for a given integer N:
    *****
    *****
    *****
    *****
    *****
     */

public class StarPatterns {

    public static void BlockPattern(int n){
        System.out.println("Pattern : Block | N = "+n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /*
    print the following pattern for a given integer N:
    *
    **
    ***
    ****
    *****
    */
    public static void rightTrianglePattern(int n){
        System.out.println("Pattern : Right Triangle | N = "+n);

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void invertedRightTriangle(int n){
        System.out.println("Pattern : Inverted Right Triangle | N = "+n);
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}


