package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CodePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("index At " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }
}