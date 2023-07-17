package Arrays;

import java.util.Arrays;

public class SortZeroesAndOne{
    public  static void sortZeroesAndOne(int[] arr) {

        int nextZero = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1};
        sortZeroesAndOne(arr);
    }
}
