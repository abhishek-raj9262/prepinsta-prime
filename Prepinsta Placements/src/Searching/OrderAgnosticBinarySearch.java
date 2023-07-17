package Searching;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    static int [] takingInput(){
        //int arr[] = {1,2,3,4,5,7,8,14,16,72,180}; // ascending order
        int arr[] = {8,7,5,6,2,1}; // descending order
        return  arr;
    }
    static int checkOrderAgnosticBinarySearch(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Target");
        int target = sc.nextInt();
        int start =0;
        int end = arr.length-1;
        boolean iSAscending;
        if (arr[start] < arr[end]) {
            iSAscending = true;
        }else {
            iSAscending = false;
        }
        while(start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (iSAscending){
                if (target > arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int arr [] =takingInput();
        int startSearch = checkOrderAgnosticBinarySearch(arr);
        System.out.println(startSearch);
    }
}
