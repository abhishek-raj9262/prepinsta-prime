package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAnArrays {
    static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Index At "+i);
            arr[i] = sc.nextInt();

        }
        System.out.print("Given Array : ");
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    static void swapTheNumber(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i+=2) {
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }
        System.out.print("After Swap : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = takingInput();
        swapTheNumber(arr);
    }
}
