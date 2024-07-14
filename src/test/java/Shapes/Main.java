package Shapes;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Area of circle: " + Circle.one.areaOfCircle);
        System.out.println("Perimeter of circle: " + Circle.one.circlePerimeter(2));
        System.out.println("Area of square: " + Square.square.squareArea(3));
        System.out.println("Perimeter of square: " + Square.square.squarePerimeter(3));
        System.out.println("Area of triangle : " + Triangle.triangle.triangleArea(2, 2));
        System.out.println("Perimeter of triangle: " + Triangle.triangle.trianglePerimeter(2, 4, 3));
        
//

    }
    

    
}
