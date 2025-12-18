package org.example;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.StringBuilder;

public class knowArrays {
    public class hashing{
        public static void countOccurences(int[] arr){
            int[] freq=new int[arr.length];

            for(int i=0;i<arr.length;i++){
                int x=arr[i];
                freq[x]++;
            }
            //Generated array
            System.out.println(Arrays.toString(arr));

            //frequency initialisation
            int max=0;
            StringBuilder maxEle=new StringBuilder();
            int min=arr.length+1;
            StringBuilder minEle=new StringBuilder();

            System.out.println("Array Element\t\tCount");
            for(int i=0;i< freq.length;i++){
                //table: element-count
                if(freq[i]>0) System.out.println(i+"\t\t\t\t\t"+freq[i]);

                //max values
                if(freq[i]>max) {
                    max = freq[i];
                    maxEle.setLength(0);
                    maxEle.append(i);
                }else if(freq[i]==max){
                    maxEle.append(" ").append(i);
                }

                //min values
                if(freq[i]<min){
                    if(freq[i]!=0) {
                        min = freq[i];
                        minEle.setLength(0);
                        minEle.append(i);
                    }
                }else if(freq[i]==min){
                    minEle.append(" ").append(i);
                }
            }
            //printing max and min frequency, elements
            System.out.println("The element with the highest frequency "+max+" is :"+maxEle);
            System.out.println("The element with the lowest frequency "+min+" is :"+minEle);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r=new Random();

        System.out.print("Enter array length(< 20):");
        int arrLen=sc.nextInt();

        //ensuring they are considering the limit
        while(arrLen>20 ||arrLen==20){
            System.out.println("Consider the limit!!!");
            System.out.print("Enter array length(< 20):");
            arrLen=sc.nextInt();
        }

        //generating random numbers to fill the array
        int[] arr=new int[arrLen];
        for(int i=0;i<arrLen;i++){
            arr[i]=r.nextInt(arr.length);
        }

        hashing.countOccurences(arr);
    }

}

