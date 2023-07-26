package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CodePair {
    static int codePair(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6};
        int ans = codePair(arr);
        System.out.println(ans);
    }
}