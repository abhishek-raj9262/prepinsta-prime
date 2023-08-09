package Recursion;

public class PowerOf2 {
    public static boolean isPowerOfTwo(int n) {
        for (int i = 0; i < n; i++) {
            int ans2 = (int) Math.pow(2,i);
            if (ans2 == n){
                return true;
            }


        }
        return false;

    }

    public static void main(String[] args) {
        int n =16;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }
}
