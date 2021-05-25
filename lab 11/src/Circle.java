public class Circle implements Shape2{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
