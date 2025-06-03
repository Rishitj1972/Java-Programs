import java.util.*;

class AreaCalculator 
{

    double area(double radius) {
        return 3.14 * radius * radius;
    }


    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, boolean isTriangle) {
        
        return 0.5 * base * height;
    }
}

public class pgm3 {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter the radius of the Circle : ");
        double r = ob.nextDouble();
        AreaCalculator a = new AreaCalculator();
        double circleArea = a.area(r);
        System.out.println("ENter the length and breadth of the Rectangle : ");
        double l = ob.nextDouble();
        double b = ob.nextDouble();
        double rectangleArea = a.area(l,b);
        System.out.println("ENter the base and height of the Rectangle : ");
        double b1 = ob.nextDouble();
        double h = ob.nextDouble();
        boolean isTriangle = true;
        double triangleArea = a.area(b1,h,isTriangle);
        
        

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
