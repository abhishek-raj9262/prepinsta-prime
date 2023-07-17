package Arrays;

public class FindDuplicateInArrays {
    public static int duplicateNumber(int arr[]) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        for (int i = 0; i < n - 1; i++) {
            ans = ans ^ i;
        }
        return ans;
    }

    public static void main(String[] args) {
        //int[] arr = {1 ,3 ,4 ,2 ,2};
        //int[] arr1 = {3 ,1 ,3 ,4 ,2};
        int[] arr2 = { 0, 3, 1, 5, 4, 3, 2};
        int number = duplicateNumber(arr2);
        System.out.println(number);
    }
}
