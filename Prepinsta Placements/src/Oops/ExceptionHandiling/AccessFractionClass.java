package Oops.ExceptionHandiling;

public class AccessFractionClass {

    public static void temp() {
        Fraction f = new Fraction(10,23);
        try {
            f.setDenominator(12);
        }
        catch (ZeroDenominatorException e){
            System.out.println("hey you cant set zero denominator");
        }
        f.print();


    }
    public static void main(String[] args) {
        temp();

    }
}