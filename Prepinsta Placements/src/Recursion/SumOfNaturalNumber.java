package Recursion;

public class SumOfNaturalNumber {
    static int sumOfN(int n){
        if (n==1){
            return 1;
        }
        int ans = sumOfN(n-1);
        return n + ans;
    }

    public static void main(String[] args) {
        int ans = sumOfN(10);
        System.out.println(ans);
    }
}
