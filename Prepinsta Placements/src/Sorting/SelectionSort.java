package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("at index " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void applySelectionSort(int[] arr){
        //this loop work for rounds
        //note - for every sorting algorithm there will be n-1 rounds
        for (int i = 0; i <arr.length-1 ; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            //this loop for finding the minimum elements
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            //swap element at index with
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        //int[] arr = takeInput();
        int[] arr = {1,6,4,8,0,3};
        applySelectionSort(arr);
        print(arr);

    }
}
