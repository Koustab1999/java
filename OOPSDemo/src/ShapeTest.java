
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//programming for interfaces not implementation
		Shape shape = new Circle(10);
		shape.draw();
		System.out.println("Area="+shape.getArea());
		//switching from one implementation to another easily
	}

}
