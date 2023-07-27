package Oops;

public class AccessFractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5,4);
        //f1.print();
       //f1.setNumerator(20);
        //f1.setDenominator(30);
        //f1.print();
        Fraction f2 = new Fraction(4,6);
        //f2.setNumerator(20);
        //f2.setDenominator(30);
        //f1.add(f2);
        f2.print();
        //f1.multiply(f2);
        f1.print();
        Fraction f3 = Fraction.add(f1,f2);
        f3.print();

    }

}
