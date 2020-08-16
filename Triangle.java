import java.lang.Math;
class Triangle{
    private double a, b, c;
    private double area;

    public Triangle(double num1, double num2, double num3){
        this.a = num1;
        this.b = num2;
        this.c = num3;
        double s = (num1 + num2 + num3)/2;
        this.area = Math.sqrt((s)*(s - num1)*(s - num2)*(s - num3)); 
    }
    public double area()
    {
        return this.area;
    }

    public String toString(){
        return String.format("Area of the triangle is " + this.area);
    }
    public static void main(String[] args) {
        Triangle tri = new Triangle(3, 5, 7);
        System.out.println(tri.area());
    }
}