package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    static  int [] takingInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n =sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("index at " +i);
            arr[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }
    static int  searchElement(int [] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Element Are You Looking For");
        int Element = sc.nextInt();
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] ==Element ) {
                System.out.print("Elment Found At Index : ");
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] =takingInput();
        int SearchElemnt=searchElement(arr);
        System.out.println(SearchElemnt);
    }
}
