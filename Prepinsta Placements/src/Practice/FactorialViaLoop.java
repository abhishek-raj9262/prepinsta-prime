package Practice;

public class FactorialViaLoop {
    static int factorial(int n){
        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans = ans * n;
            n--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n =5;
        int ans = factorial(n);
        System.out.println(ans);
    }
}





