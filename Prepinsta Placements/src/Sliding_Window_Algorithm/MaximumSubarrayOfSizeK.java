package Sliding_Window_Algorithm;

public class MaximumSubarrayOfSizeK {
    static int maxSum(int arr[], int n, int k){
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum = maxSum + arr[i];

        }
        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);

        }
        return maxSum;
    }




    public static void main(String[] args) {
        int arr[]={3,4,5,7,9};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));

    }
}
