public class TestShape {

 

    public static void main(String[] args) {
        Circle1 c =new Circle1(10);
        c.draw();
        System.out.println(c.getRadius());
        System.out.println("The Area of circle is : "+Math.round(c.getArea()));
        Shape1 s2=new Rectangle1(10,20);
        s2.draw();
        System.out.println("The Area of Rectangle is : "+s2.getArea());
    }

 

}