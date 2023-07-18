package Arrays.KadanesAlgorithm;

public class MaxSumOfSubarrys {
    static long maxSubarraySum(int arr[], int n) {
        long currentSum = 0;
        int  maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum > maxSum) {
                maxSum = (int)currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }

        }
        return currentSum;

    }

    public static void main(String[] args) {
        int[] arr = {-1 -2 -3 -4};
        long ans = maxSubarraySum(arr,5);
        System.out.println(ans);
    }

}

