package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleOfArrays{
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
        int mult =1;
        for (int i = 0; i < n; i++) {
            mult = mult * arr[i];

        }
        System.out.print("The Array Your Are Given of Size " + n + " is : ");
        System.out.println(Arrays.toString(arr));
        return mult;

    }

    public static void main(String[] args) {
        int arr[]=takingInput();
        int mult =printingArray(arr);
        System.out.println("mult = " + mult);
    }
}


