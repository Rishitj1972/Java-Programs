//Class Object Concept (Array of object also)

import java.util.*;

class Book
{
    String title,author;
    int price;
    
    Book(String title,String author,int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display()
    {
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }
}

class pgm1
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Limit : ");
        int n = ob.nextInt();
        Book b[] = new Book[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Title : ");
            ob.nextLine();
            String title = ob.nextLine();
            System.out.println("Enter the Author : ");
            String author = ob.nextLine();
            System.out.println("Enter the Price : ");
            int price = ob.nextInt();
            b[i] = new Book(title,author,price);
            b[i].display();
            System.out.println();
        }
        Book max = b[0];
        for(int i=0;i<n;i++)
        {
            if(b[i].price > max.price)
            {
                max = b[i];
            }
        }
        System.out.println("Expensive Book : ");
        max.display();
    }
}