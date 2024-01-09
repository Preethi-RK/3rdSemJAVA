import java.util.Scanner;
abstract class InputScanner
{
	abstract void get_dim();
}
abstract class Shape extends InputScanner
{
	int a,b;
	Shape(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Shape(int a)
	{
		this.a=a;
		this.b=0;
	};
	abstract void printArea();
}
class Rectangle extends Shape
{
	
	Rectangle(int a,int b)
	{
		super(a,b);
	}
	void get_dim()
	{
		System.out.println("Enter the dimensions of the rectangle(length and breadth)");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	}
	void printArea()
	{
		System.out.println("Area of Rectangle = "+(a*b));
	}
}
class Triangle extends Shape
{
	Triangle(int a,int b)
	{
		super(a,b);
	}
	void get_dim()
	{
		System.out.println("Enter the dimensions of the triangle(base and height)");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	}
	void printArea()
	{
		System.out.println("Area of triangle = "+(0.5*a*b));
	}
}
class Circle extends Shape
{
	Circle(int a)
	{
		super(a);
	}
	void get_dim()
	{
		System.out.println("Enter the dimension of the circle(radius)");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		
	}
	void printArea()
	{
		System.out.println("Area of circle = "+(3.14*a*a));
	}
}
class ShapeMain
{
	public static void main(String args[])
	{
		Rectangle r= new Rectangle(0,0);
		Triangle t= new Triangle(0,0);
		Circle c= new Circle(0);
		r.get_dim();
		t.get_dim();
		c.get_dim();
		r.printArea();
		t.printArea();
		c.printArea();
	}
}
		



	