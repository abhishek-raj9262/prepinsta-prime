package Arrays;

public class ReverseTheArray {
    public static void reverse(int[] arr){
        int n = arr.length-1;
        for (int i = 0; i<n ; i++) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
        }

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        print(arr);
    }
}
