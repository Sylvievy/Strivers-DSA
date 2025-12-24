package org.example;
import java.util.Scanner;
import java.util.Random;

public class sortingSearching {

    public static void bubbleSort(int[] arr){
        System.out.println("Sorted array using Bubble sort:");
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int num:arr){
            System.out.print(num+" ");
        }

    }

    public static void selectionSort(int[] arr){
        System.out.println("Sorted array using Selection sort:");
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

    public static int[] insertionSort(int[] arr){
        System.out.println("Sorted array using Insertion Sort:");
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            //check from left to the curr index. i.e before the index. never to the right side of it.
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        return arr;
    }

    public static void binarySearch(int[] arr, int n){
        int[] sortedArr=insertionSort(arr);
        System.out.println("Given element to find:"+n);

        int low=0;
        int high=sortedArr.length-1;

        while(low<=high){
            /*
            we do not use arr.length/2 because it constantly checks the middle of the entire array
            instead of the new middle when we cut the array into half
             */
            int mid=low+(high-low)/2; //(high-low) check for integer overflow

            if(n==sortedArr[mid]){
                System.out.println("the given element is at index "+mid);
                return;
            }
            if(n>sortedArr[mid]){
                low=mid+1;
            }

            if(n<sortedArr[mid]){
                high=mid-1;
            }
        }
        System.out.println("the given element does not exist in here!!");

    }


    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length (Arrlength < 10): ");
        int arrLen=sc.nextInt();
        int[] arr=new int[arrLen];
//        System.out.println("The generated array is:");
        for(int i=0;i<arrLen;i++) {
            arr[i] = r.nextInt(20);
//            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int x=r.nextInt(19);
//        selectionSort(arr);
//        insertionSort(arr);
//        bubbleSort(arr);

        binarySearch(arr, x);

    }
}
