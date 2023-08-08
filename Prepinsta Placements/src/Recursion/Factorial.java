package Recursion;

public class Factorial {
    static  int factorialOfN(int n){
        if (n==0){
            return 1;
        }
        int ans = factorialOfN(n-1);
        int ans2 = n * ans;
        return ans2;
    }

    public static void main(String[] args) {
        int n = 3;
        int ans = factorialOfN(n);
        System.out.println(ans);
    }
}
