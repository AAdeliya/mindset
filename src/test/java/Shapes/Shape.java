package Shapes;

public class Shape {
    //area
    //perimeter 
    final double pi=3.14;

    public double circleArea(int r){
     double areaCircle= pi* Math.pow(r, 2);
    return areaCircle;

    }
    public double circlePerimeter(int r){
    double perimeterCircle = 2*pi*r;
    return perimeterCircle;

    }
    public int squareArea(int a){
    int squareArea= (int) Math.pow(a, 2);
    return squareArea;
        
    }
    public int squarePerimeter(int a){
        int squarePerimeter = 4*a;
        return squarePerimeter;

    }
    public int triangleArea(int h, int b){
        int triangleArea = (h*b)/2;
        return triangleArea;

    }
    public int trianglePerimeter(int a, int b, int c){
        int trianglePerimeter= a+b+c;
        return trianglePerimeter;
        
    }
    
}
