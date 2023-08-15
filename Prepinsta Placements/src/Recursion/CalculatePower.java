package Recursion;

public class CalculatePower {
    public static int power(int x, int n) {
        if(n==0) {
            return 1;
        }
        int answer = x*power(x ,n-1);
        return answer;

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 2;
        int ans = power(x,n);
        System.out.println(ans);
    }
}
