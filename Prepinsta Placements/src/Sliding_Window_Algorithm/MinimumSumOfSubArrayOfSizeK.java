package Sliding_Window_Algorithm;

public class MinimumSumOfSubArrayOfSizeK {
    static int minSum(int arr[], int n, int k){
        int minSum = 0;
        for (int i = 0; i < k; i++) {
            minSum = minSum + arr[i];

        }
        int windowSum = minSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i-k];
            minSum = Math.min(minSum,windowSum);

        }
        return minSum;
    }




    public static void main(String[] args) {
        int arr[]={3,4,5,7,9};
        int k = 2;
        int n = arr.length;
        System.out.println(minSum(arr, n, k));

    }
}
