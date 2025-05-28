/*Write a java program to calculate the area of different shapes namely
circle, rectangle and triangle using the concept of method overloading.*/
import java.util.*;
class over
{
 
  void area(double l,double b)
  { double ar;
    ar=l*b;
    System.out.println("area of rectangle is : "+ar);
  }
  double area(double r)
  { double ar;
 
    ar=3.14*r*r;
    return ar;
  }
  void area()
  { double h,b,ar;
    Scanner in =new Scanner(System.in);
    System.out.println("enter height and base of traingle");
     h=in.nextDouble();
      b=in.nextDouble();
      ar=0.5*h*b;
      System.out.println("area of traingle is : "+ar);
 
  }
  }
  public class java15_1
  {
  public static void main(String args[])
  { Scanner in =new Scanner(System.in);
  over ob =new over();
    System.out.println("enter length and breadth of rectangle ");
     double l=in.nextDouble();
     double b=in.nextDouble();
     ob.area(l,b);
     System.out.println("enter radius of circle");
     double r=in.nextDouble();
     double s=ob.area(r);
     System.out.println("area of circle  "+s);
     ob.area();
   }
   }
