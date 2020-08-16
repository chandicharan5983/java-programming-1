import java.util.*;

class Rectangle{
	public int height;
	public int width;

	public void  display(){
		System.out.println( "Width and Height : " + this.width + " " + this.height);
	}

}

class RectangleArea extends Rectangle{

	public void read_input()
	{
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();
		this.width = w;
		this.height = h;
	}
	public void display(){
		super.display();
		System.out.println("Area: " + width*height);
	}

	public static void main(String[] args){
		RectangleArea ob = new RectangleArea();
		ob.read_input();
		ob.display();


	}
}
