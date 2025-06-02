/*
Create CPU with attribute price. Create inner class Processor with attributes 
no. of cores,    manufacturer  and  static  nested  class  RAM  with  attributes       
memory  and  manufacturer.  Create  an  object  of  CPU  class  and  print 
information of Processor and RAM
*/

import java.util.*;

class CPU 
{
    int price;
    
    CPU(int price)
    {
        this.price = price;
    }
    
    class Processor
    {
        int cores;
        String m;
        Processor(int cores,String m)
        {
            this.cores = cores;
            this.m = m;
        }
        void display()
        {
            System.out.println("Cores : "+cores);
            System.out.println("manufacturer : "+m);
        }
    }
    
    static class RAM 
    {
        int memory;
        String m;
        RAM(int memory,String m)
        {
            this.memory = memory;
            this.m=m;
        }
        void display()
        {
            System.out.println("Memory : "+memory);
            System.out.println("manufacturer : "+m);
        }
    }
    void display()
    {
        System.out.println("Price : "+price);
    }
}

class pgm2 
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the price : ");
        int price = ob.nextInt();
        CPU c = new CPU(price);
        
        System.out.println("Enter the Cores : ");
        int cores = ob.nextInt();
        ob.nextLine();
        System.out.println("Enter the Manufacturer : ");
        String m1 = ob.nextLine();
        CPU.Processor p =c.new Processor(cores,m1);
        
        System.out.println("Enter the Memory : ");
        int memory = ob.nextInt();
        ob.nextLine();
        System.out.println("Enter the Manufacturer : ");
        String m2 = ob.nextLine();
        CPU.RAM r = new CPU.RAM(memory,m2);
        
        c.display();
        p.display();
        r.display();
    }
}