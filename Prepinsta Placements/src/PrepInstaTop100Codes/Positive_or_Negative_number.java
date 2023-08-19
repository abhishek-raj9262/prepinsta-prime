package PrepInstaTop100Codes;

import java.util.Scanner;

public class Positive_or_Negative_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0){
            System.out.println("zero");
            return;
        }
         if (n > 0){
            System.out.println("positive");

        }else {
             System.out.println("negative");
         }

    }
}
