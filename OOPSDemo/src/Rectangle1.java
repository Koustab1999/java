public class Rectangle1 implements Shape1 {
    private double length,width;
    
    public Rectangle1(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

 

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");

 

    }

 

    @Override
    public double getArea() {
        return (double)length*width;
    }

 

}
 