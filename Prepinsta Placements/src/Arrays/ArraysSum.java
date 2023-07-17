package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSum {
    static int [] takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("index At " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static int  printingArray(int [] arr){
        int n= arr.length;
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

        }
        System.out.print("The Array Your Are Given of Size " + n + " is : ");
        System.out.println(Arrays.toString(arr));
        return sum;

    }

    public static void main(String[] args) {
        int arr[]=takingInput();
        int sum =printingArray(arr);
        System.out.println("Sum = " + sum);
    }
}