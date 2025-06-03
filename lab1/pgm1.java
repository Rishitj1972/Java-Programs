//Library management System

import java.util.*;

class Library
{
    int b_id,price;
    String title,author;
    
    Library(int b_id,int price,String title,String author)
    {
        this.b_id = b_id;
        this.price = price;
        this.title = title;
        this.author = author;
    }
    void display()
    {
        System.out.println("Book ID = "+b_id);
        System.out.println("Book title = "+title);
        System.out.println("Book Author = "+author);
        System.out.println("Book Price = "+price);
    }
}

class pgm1 
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Limit : ");
        int n = ob.nextInt();
        Library l[] = new Library[n];
        for(int i=0;i<n;i++)
        {
            System.out.println();
            System.out.println("Enter the id : ");
            int b_id = ob.nextInt();
            ob.nextLine();
            System.out.println("ENter the title : ");
            String title = ob.nextLine();
            System.out.println("Enter the Author : ");
            String author = ob.nextLine();
            System.out.println("Enter the Price : ");
            int price = ob.nextInt();
            
            l[i] = new Library(b_id,price,title,author);
            System.out.println();
            l[i].display();
        }
        System.out.println("\nEnter the Author Name to Search Books : ");
        ob.nextLine();
        String aname = ob.nextLine();
        boolean found = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (aname.equalsIgnoreCase(l[i].author)) {
                count++;
                if (!found) {
                    System.out.println("\nBooks by Author: " + aname);
                    System.out.println("--------------------------------");
                    found = true;
                }
                l[i].display();
                System.out.println();
            }
        }
        System.out.println("Count of books by author = "+count);

        if (!found) {
            System.out.println("No books found by author: " + aname);
        }
    }
}
