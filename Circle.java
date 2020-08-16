import java.util.Scanner;
class Circle {

	private double radius=1.0;
	private String color="red";
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return (3.14*radius*radius);
	}
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		double radius= scanner.nextDouble();
		
		Circle circle2 = new Circle(radius);
		
	
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getArea());
		
	}	
}