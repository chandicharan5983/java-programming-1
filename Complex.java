import java.util.*;
class Complex{

    private int real;
    private int imaginary;
    public int getReal(){
        return this.real;
    }
    private int getImaginary(){
        return this.imaginary;
    }

    void setReal(int re){
        this.real = re;
    }
    void setImaginary(int ima){
        this.imaginary = ima;
    }

    public static Complex sum(Complex a, Complex b){
        Complex res = new Complex();
        res.real = a.real + b.real;
        res.imaginary = a.imaginary + b.imaginary;
        return res;
    }

    public static Complex difference(Complex a, Complex b){
        Complex res = new Complex();
        res.real = a.real - b.real;
        res.imaginary = a.imaginary - b.imaginary;
        return res;
    }
    public static Complex product(Complex a, Complex b){
        Complex res = new Complex();
        res.real = (a.real*b.real - a.imaginary*b.imaginary);
        res.imaginary = (a.real*b.imaginary + a.imaginary*b.real);
        return res;
    }
    public String toString(){
        return String.format(this.real + " + " + this.imaginary + "i");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real part");
        int real = sc.nextInt();
        System.out.println("Enter Imaginary part");
        int imaginary = sc.nextInt();
        Complex cn = new Complex();
        cn.setReal(real);
        cn.setImaginary(imaginary);

        System.out.println("Enter Real part");
        real = sc.nextInt();
        System.out.println("Enter Imaginary part");
        imaginary = sc.nextInt();
        Complex cn2 = new Complex();
        cn2.setReal(real);
        cn2.setImaginary(imaginary);

        // System.out.println(Complex.sum(cn, cn2));
        // System.out.println(Complex.difference(cn, cn2));
        System.out.println(Complex.product(cn, cn2));
    }
}