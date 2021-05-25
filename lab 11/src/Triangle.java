public class Triangle implements Shape2{
    private double height,base;
    public Triangle(double height, double base){
        this.base=base;
        this.height=height;
    }

    @Override
    public double area() {
        return (base*height)/2;
    }
}
