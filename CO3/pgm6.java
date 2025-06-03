// Dynamic method dispatch with method overriding

/*Create a class with Vehicle with serial no, type and name as instance variables 
and display the details. Create a subclass of Vehicle as Car with serial no, name 
and  cost  as  instance  variables and  display  the  details.  Implement  runtime       
polymorphism (method overriding with dynamic method dispatch)*/

import java.util.*;

class Vehicle 
{
    int sno;
    String name;
    Vehicle(int sno,String name)
    {
        this.sno = sno;
        this.name = name;
    }
    void display()
    {
        System.out.println("Serial Number : "+sno);
        System.out.println("Name : "+name);
    }
}

class Car extends Vehicle 
{
    int cost;
    Car(int sno,String name,int cost)
    {
        super(sno,name);
        this.cost = cost;
    }
    void display()
    {
        System.out.println("Cost : "+cost);
    }
}

class pgm6 
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("ENter the Serial no : ");
        int sno = ob.nextInt();
        ob.nextLine();
        System.out.println("Enter the name : ");
        String name = ob.nextLine();
        System.out.println("Enter the Cost : ");
        int cost = ob.nextInt();
        
        Vehicle v;
        v = new Vehicle(sno,name);
        v.display();
        v = new Car(sno,name,cost);
        v.display();
    }
}
