package Oops.ExceptionHandiling;

public class AccessFractionClass {

    public static void temp() throws ZeroDenominatorException{
        Fraction f = new Fraction(10,0);
        try {
            f.setDenominator(7);
        }
        catch (ZeroDenominatorException e){
            System.out.println("hey you cant set zero denominator");
        }
        f.print();


    }
    public static void main(String[] args) throws ZeroDenominatorException{
        temp();

    }
}