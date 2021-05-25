public class HomeActivityRunner {
    public static void main(String[] args) {
        Shape square = new Square(33);
        System.out.println("Perimeter of Square is "+ square.perimeter() );
        Shape rectangle = new Rectangle(8,9);
        System.out.println("Perimeter of Square is "+ rectangle.perimeter());
    }
}
