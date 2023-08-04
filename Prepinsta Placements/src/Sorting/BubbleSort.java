package Sorting;

public class BubbleSort {
    public static void applyBubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

    public static void main(String[] args) {
        int[] arr = {1,7,4,3,9,2,6};
        applyBubbleSort(arr);
        print(arr);
    }
}
