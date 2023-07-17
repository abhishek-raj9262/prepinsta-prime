package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class ArrangeTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int n= sc.nextInt();
        int arr []=new int[n];
        System.out.println(Arrays.toString(arr));
        int counter = 1;
        int left = 0;
        int right = n - 1;
        while (left <= n / 2) {
            arr[left] = counter;
            counter++;
            left++;
            if (counter > n) {
                break;
            }
            arr[right] = counter;
            counter++;
            right--;
        }arr[n/2]=n;
        System.out.println(Arrays.toString(arr));

    }
}
