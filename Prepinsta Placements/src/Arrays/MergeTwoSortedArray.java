package Arrays;

public class MergeTwoSortedArray {
    public static int[] mergeArray(int[] arr,int[] arr2){
        int[] arr3 = new int[arr.length + arr2.length];
       int i = 0;
       int j = 0;
       int k = 0;
       while (i< arr.length && j< arr2.length){
           if (arr[i] <= arr2[j]){
               arr3[k] = arr[i];
               k++;
               i++;
           }else {
               arr3[k] = arr2[j];
               k++;
               j++;

           }
       }
       while (i<arr.length){
           arr3[k] = arr[i];
           k++;
           i++;
       }
       while (j<arr2.length){
           arr3[k] = arr[j];
           j++;
           k++;
       }
       return arr3;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,8,10,13,17};
        int[] arr2 = {2,3,5,7,9,11,12};
       int[] ans =  mergeArray(arr,arr2);
        print(ans);
    }
}
