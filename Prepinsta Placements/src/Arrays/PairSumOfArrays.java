package Arrays;

public class PairSumOfArrays {
    /*
    You have been given an integer array/list(ARR) and a number X.
    Find and return the total number of pairs in the array/list which sum to X.
    Note:(
         Given array/list can contain duplicate elements.)
     */
    public static int pairSum(int arr[], int x) {
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j]== x) {
                    count++;
                }
            }
        }return count;
    }
    public static void main(String[] args) {
        int[] arr = {1 ,3 ,6 ,2 ,5 ,4, 3 ,2 ,4};
        int ans = pairSum(arr,7);
        System.out.println(ans);
    }
}

