package Sliding_Window_Algorithm;

public class FirstNegativeInteger {
    static int maxSum(int arr[], int n, int k){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            if (arr[i]< min){
                min = arr[i];
                break;
            }

        }
        int windowSum = min;
        for (int i = k-1; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i-k];
            min = Math.max(min,windowSum);

        }
        return min;
    }




    public static void main(String[] args) {
        int arr[]={3,4,5,7,9};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));

    }
}
