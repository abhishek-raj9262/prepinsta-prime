package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindUnique {
    public static int findUnique(int[] arr) {
        //Your code goes here
        int n = arr.length;
        int xor = 0;
        for (int i = 0;  i < n; i++) {
            xor = xor^arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 3, 6};
        int n = findUnique(arr);
        System.out.println(n);
    }
}
