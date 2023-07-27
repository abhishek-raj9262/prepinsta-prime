package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    int numerator;
    int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Practice(int numerator, int denominator){
        this.numerator = numerator;
        if (denominator == 0){
            //ToDo error out
        }
        this.denominator = denominator;
        simplify();
    }
    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for (int i = 2; i <=smaller ; i++) {
            if (numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    public static void main(String[] args) {
        Practice p1 = new Practice(20,30);
        System.out.println(p1.getDenominator());
    }

}




