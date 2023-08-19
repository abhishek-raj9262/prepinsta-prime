package PrepInstaTop100Codes;

import java.util.Scanner;

public class SumOfFirstN_NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add =0;
        for (int i = 1; i <= n; i++) {
            add = add + i;
        }
        System.out.println(add);
    }
}
