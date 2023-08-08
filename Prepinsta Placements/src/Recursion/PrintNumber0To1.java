package Recursion;

public class PrintNumber0To1 {
    static void decreasingOrderNTo1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        decreasingOrderNTo1(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        decreasingOrderNTo1(n);
    }
}
