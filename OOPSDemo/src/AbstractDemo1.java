abstract class Shape
{
	String objectName = " ";
	Shape(String name)
	{
		this.objectName= name;
	}
public void moveTo(int x, int y)
{
	System.out.println(this.objectName + " " + " has been moved to" + " x = " + x + "and y =" + y);
}
// abstract methods which will be implemented by its subclass(es)
abstract public double area();
abstract public void draw();
}
class Rectangle extends Shape
{
	int length ,width;
	Rectangle(int length, int width, String name)
	{
		super(name);
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
	
		return (double)(length*width);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle has been drawn ");
	}
	
}
class Circle extends Shape
{
	double pi =3.14;
	int radius;
	Circle(int radius, String name)
			{
		super(name);
		this.radius=radius;
			}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (double)((pi*radius*radius)/2);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Cicle has been drawn ");
	}
	
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
// creating the object of rectangle class and using shape class reference.
		Shape rect = new Rectangle(2,3, "Rectangle");
		rect.draw();
		System.out.println("Area of rectangle: " + rect.area());
		rect.moveTo(1,2);
		System.out.println(" ");
		// creating the objects of circle class
		Shape circle = new Circle(2, "Circle");
		System.out.println("Area of circle: " + circle.area());
	}

}
