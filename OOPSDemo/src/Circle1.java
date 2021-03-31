
public class Circle1 implements Shape1 {
    private int radius;
    Circle1(int radius){
        super();
        this.radius=radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

 

    @Override
    public double getArea() {
        return (double)radius*radius*Math.PI;
    }
    
    public double getRadius() {
        return (double)radius;
    }
}