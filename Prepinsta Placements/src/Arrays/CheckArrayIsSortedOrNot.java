package Arrays;

public class CheckArrayIsSortedOrNot {
     static boolean arraySortedOrNot(int[] arr, int n) {
        for(int i =1; i < n;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       int arr[] = {10, 20, 30, 40, 50};
       boolean ans = arraySortedOrNot(arr, arr.length);
        System.out.println(ans);
    }
}
