package Searching;

import java.util.Scanner;

public class BinarySearch {
    static int [] takingInput(){
        int arr[] = {-18,-12,0,2,4,8,12,45,50,55,62,78,200,422};
        return arr;
    }
    static int  binarySearch(int [] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Target");
        int target= sc.nextInt();
        int n = arr.length;
        int start=0;
        int end = n-1;
        while (start<=end){
            int mid = start + (end-start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;

            }else {
                start = mid + 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] =takingInput();
        int search = binarySearch(arr);
        System.out.println(search);

    }
}
