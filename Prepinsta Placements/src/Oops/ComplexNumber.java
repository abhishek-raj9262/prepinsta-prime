package Oops;

public class ComplexNumber {
    private int real;
    private int imaginary;

    //here we make constructor for complex number class
    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void addOf2ComplexNumber(ComplexNumber c2){
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }
    public void print(){
        System.out.println(real + "+"+ "i" + imaginary);
    }
    
}
