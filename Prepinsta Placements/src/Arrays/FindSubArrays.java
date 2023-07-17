package Arrays;

public class FindSubArrays {
    static void subArray(int[] arr) {
        //find the totalSub arrays
        int totalSubArrays = 0;
        //find totalSum of subArrays
        int totalSum = 0;
        int sumOfSubArrays = 0;
        int maxSumOfSubArrays = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sumOfSubArrays= 0;
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k] + " ");
                    totalSum = totalSum + arr[k];
                    sumOfSubArrays = sumOfSubArrays + arr[k];

                }
                System.out.println();
                System.out.println("SubArraysSum = " + sumOfSubArrays);
                if (sumOfSubArrays > maxSumOfSubArrays) {
                    maxSumOfSubArrays = sumOfSubArrays;

                }
                totalSubArrays++;

            }
        }
        System.out.println("Total SubArrays = " + totalSubArrays);
        System.out.println("TotalSum = " + totalSum);
        System.out.println("Maximum SubArrays Sum = " + maxSumOfSubArrays);
    }

    public static void main(String[] args) {
        int[] arr = { 2,4,6,8,10};
        subArray(arr);
    }

}

