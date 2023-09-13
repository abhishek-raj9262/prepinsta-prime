package Recursion;

public class CheckSortedBetter {
    static boolean checkSortedBetter(int[] arr, int startIndex){
        if (startIndex >= arr.length-1){
            return true;
        }
        if (arr[startIndex] > arr[startIndex+1]){
            return false;
        }
        boolean ans = checkSortedBetter(arr,startIndex+1);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        boolean ans = checkSortedBetter(arr,0);
        System.out.println(ans);
    }
}
