public class Shape2Runner {
    public static void main(String[] args) {
        Shape2[] shapes=new Shape2[5];
        shapes[0]=new Circle(5);
        shapes[1]=new Circle(4);
        shapes[2]=new Rectangle2(2,12);
        shapes[3]=new Triangle(1,5);
        shapes[4]=new Triangle(3,3);

        double areaa[] = CalculateArea.Area(shapes);
        for(double area: areaa) {
            System.out.println(area);
        }
    }

}

