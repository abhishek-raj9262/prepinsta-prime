package Arrays;

public class CheckSorted {
    public static boolean check(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]){
            return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        boolean ans = check(arr);
        System.out.println(ans);
    }
}
