package Oops.inheritance;

public class AccessVehicle {
    public static void main(String[] args) {
        //for car class
        Car c = new Car();
        c.colour = "black";
        c.maxSpeed = 300;
        c.print();


        //for Bicycle class
        Bicycle b = new Bicycle();
        b.colour = "red";
        b.maxSpeed = 120;
        b.print();
    }
}
