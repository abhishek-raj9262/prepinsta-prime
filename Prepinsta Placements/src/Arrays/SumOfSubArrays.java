package Arrays;

public class SumOfSubArrays {
    static int sum(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                temp=temp+arr[j];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ans = sum(arr);
        System.out.println(ans);
    }
}