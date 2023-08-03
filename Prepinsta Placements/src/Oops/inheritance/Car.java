package Oops.inheritance;

public class Car extends Vehicle {
    int numOfGear;
    boolean isConvertible;

    @Override
    public void print() {
        super.print();
        System.out.println("gear : " + numOfGear);
        System.out.println("convertible : " + isConvertible);
    }
}
