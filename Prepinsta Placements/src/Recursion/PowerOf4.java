package Recursion;

public class PowerOf4 {
    public static boolean isPowerOfFour(int n) {
        if (n < 0) {
            return false;
        }
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0) {
            return false;

        }
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        boolean ans = isPowerOfFour(5);
        System.out.println(ans);

    }
}
