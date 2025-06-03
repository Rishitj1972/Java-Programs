//Simple Interface

import java.util.*;

interface Area 
{
    double area();
}

class Rectangle implements Area 
{
    double l,b;
    Rectangle(double l,double b)
    {
        this.l = l;
        this.b = b;
    }
    public double area()
    {
        return l*b;
    }
}

class Circle implements Area 
{
    double r;
    Circle(double r)
    {
        this.r= r;
    }
    public double area()
    {
        return 3.14*r*r;
    }
}

class Main 
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter the Length : ");
        double l = ob.nextInt();
        System.out.println("Enter the Breadth : ");
        double b = ob.nextInt();
        Rectangle r1 = new Rectangle(l,b);
        System.out.println("Area = "+r1.area());
        System.out.println("Enter the radius : ");
        double r = ob.nextInt();
        Circle c = new Circle(r);
        System.out.println("Area = "+c.area());
    }
}
