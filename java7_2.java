//Implement default constructor using rectangle class

import java.util.*;
class Rectangle
{
int l,b;
int area;
public Rectangle()
{
l = 10;
b = 20;
}

void area()
{
area = l * b;
System.out.println("Area = "+area);
}

}

public class java7_2
{
public static void main(String[] args)
{
Rectangle ob = new Rectangle();
ob.area();
}
}
