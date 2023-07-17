package Arrays;

public class IntersectionOfTwoArrays {
    static void intersectionOfTwoArrays(int[] arr1,int[] arr2){
        int n = arr1.length;
        int n2= arr2.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        //int[] arr1 = {2,6,8,5,4,3};
        //int[] arr2 = {2,3,4,7};
        //int[] arr1 = {10,10};
        //int[] arr2 = {10};
        int[] arr1 = {6,2,3};
        int[] arr2 = {2,6,2,3,4};
        intersectionOfTwoArrays(arr1,arr2);

    }
}

