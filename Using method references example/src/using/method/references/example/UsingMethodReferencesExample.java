package using.method.references.example;

/**
 *
 * @author onure
 */
public class UsingMethodReferencesExample {
    
    public static void main(String[] args) {
        Square s = new Square(5);
        
        Shape shape = (Square square) -> {
            return square.calculateArea();
        };
        
        System.out.println("Area : " + shape.getArea(s));
        
        Shape shape2 = Square::calculateArea;
        
        System.out.println("Area : " + shape.getArea(s));
    }
    
}
