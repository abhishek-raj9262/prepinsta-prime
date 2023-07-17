package DsaByShardhaDidi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ChocolateDistributionProblem {
    static int findDifferance(int[] arr, int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i+m-1< arr.length; i++) {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min ){
                min = diff;
            }

        }
        return min;
    }


    public static void main(String[] args) {
        int arr[] = {7, 3, 2,4,9,12,56};
        int m = 3;
        int ans = findDifferance(arr,m);
        System.out.println(ans);
    }
}
