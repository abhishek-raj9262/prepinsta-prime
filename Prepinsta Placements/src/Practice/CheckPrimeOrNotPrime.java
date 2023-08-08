package Practice;

public class CheckPrimeOrNotPrime {
    static void fac(int n){
        int d =2;
        for (int i = d; i < n-1; i++) {
            if (n%d==0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
    public static void main(String[] args) {
        fac(1);

    }

}
