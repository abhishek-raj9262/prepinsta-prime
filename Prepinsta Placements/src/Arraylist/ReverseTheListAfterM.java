package Arraylist;
import java.util.ArrayList;
public class ReverseTheListAfterM {
    public static void reverseArray(int[]  arr, int m)
    {
        int count = m;
        int n = arr.length-1;
        for (int i = count; i < n; i++) {
                int temp = arr[count+1];
                arr[count+1] = arr[n];
                arr[n] = temp;
                n--;
                count++;

        }

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverseArray(arr,1);
        print(arr);

    }
}
