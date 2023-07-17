package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestInArray {
    static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Index At " + i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Given Array : ");
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    static  int findLargest(int arr []){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr [] = takingInput();
        int find = findLargest(arr);
        System.out.println();
        System.out.print("Largest Among The Array : ");
        System.out.println(find);
    }
}