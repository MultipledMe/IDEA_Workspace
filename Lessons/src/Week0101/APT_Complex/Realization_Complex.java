package Week0101.APT_Complex;

public class Realization_Complex implements Interface_for_complex{
    private double real;
    private double imag;
    public Realization_Complex(double real,double imag){
        this.real = real;
        this.imag = imag;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real = real;
    }
    public double getImag(){
        return imag;
    }
    public void setImag(double imag){
        this.imag = imag;
    }
    public void add(Interface_for_complex Z){
        if (Z != null){
            real +=Z.getReal();
            imag +=Z.getImag();
        }
    }
}
