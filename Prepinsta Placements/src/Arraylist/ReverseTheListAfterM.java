package Arraylist;
import java.util.ArrayList;
public class ReverseTheListAfterM {
    public static void reverseArray(int[]  arr, int m)
    {
        int count = 0;
        int n = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (count == m){
                int temp = arr[count+1];
                arr[count+1] = arr[n];
                arr[n] = temp;
                n--;
            }

        }

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr,2);
        print(arr);

    }
}
