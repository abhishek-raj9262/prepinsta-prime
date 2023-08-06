package Oops.ExceptionHandiling;

public class AccessFractionClass {

    public static void temp() throws ZeroDenominatorException{
        Fraction f = new Fraction(10,8);
        try {
            f.setDenominator(0);
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