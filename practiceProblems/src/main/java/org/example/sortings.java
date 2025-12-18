package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static java.util.Collections.swap;

public class sortings {

    public static void selctionSort(int[] arr){
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                int currIndex=j;
                if(arr[currIndex]<arr[minIndex]) {
                    minIndex = currIndex;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
            System.out.print(arr[i]+" ");
        }


    }

    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length (Arrlength < 20): ");
        int arrLen=sc.nextInt();
        int[] arr=new int[arrLen];
        System.out.println("The generated array is:");
        for(int i=0;i<arrLen;i++) {
            arr[i] = r.nextInt(20);
            System.out.print(arr[i]+" ");
        }
        selctionSort(arr);

    }
}
