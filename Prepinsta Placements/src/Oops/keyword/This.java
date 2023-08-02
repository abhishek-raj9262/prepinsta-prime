package Oops.keyword;

public class This {
    private int numerator;
    private int denominator;

    public This(int numerator,int denominator){
        this.numerator = numerator;
        if (denominator == 0){
            //ToDo error out
        }
        this.denominator = denominator;
    }
}
