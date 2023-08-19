package DsaByShardhaDidi;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int end = nums.length-1;
        for (int i = end; i > 0 ; i++) {
            if (nums[end] <nums[end-1] ){
                int temp = nums[end];
                nums[end] = nums[end-1];
                nums[end-1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));

    } static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
        print(arr);
    }



}
