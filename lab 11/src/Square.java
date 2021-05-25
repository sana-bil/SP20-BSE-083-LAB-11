public class Square implements Shape{
    private double area;
    public Square(double area){
        this.area=area;
    }

    @Override
    public double perimeter() {
        return 4*area;
    }
}
