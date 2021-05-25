public class Rectangle2 implements Shape2{
    private double length, width;
    public Rectangle2(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return length*width;
    }
}
